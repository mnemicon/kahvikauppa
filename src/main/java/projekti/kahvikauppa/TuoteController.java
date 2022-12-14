package projekti.kahvikauppa;

// import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TuoteController {

    @Autowired
    private TuoteService tuoteService;

    @GetMapping("/kahvilaitteet")
    public String showProducts(Model model) {
        model.addAttribute("tuotteet", tuoteService.list());
        return "kahvilaitteet";
    }
    @GetMapping("/tuotesivu/{tuoteId}")
    public String getTuotesivu(Model model, @PathVariable(value = "tuoteId") Long tuoteId) {
        model.addAttribute("tuote", tuoteService.get(tuoteId));
        return "/tuotesivu";
    }
    @PostConstruct
    public void init() {
        tuoteService.add("gulbs", "uutta", 29, "kuva", (long) 1);
        tuoteService.add("asdfasdf", "vanha", 59, "kuva", (long) 1);
        tuoteService.add("rrss", "hyvää", 55, "kuva", (long) 1);
    }

    @PostMapping("/kahvilaitteet")
    public String addProduct(String nimi, String kuvaus, int hinta, String kuva, Long id) {
        tuoteService.add(nimi, kuvaus, hinta, kuva, id);
        return "redirect:/kahvilaitteet";
    }
   
    @PostMapping("/kahvilaitteet/{tuoteId}/osastot")
    public String assignOsasto(@PathVariable Long tuoteId, @RequestParam Long osastoId) {
        tuoteService.assign(tuoteId, osastoId);
        return "redirect:/kahvilaitteet";
    }
}