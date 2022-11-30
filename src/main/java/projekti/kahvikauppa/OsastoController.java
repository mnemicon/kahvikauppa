package projekti.kahvikauppa;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OsastoController {
    @Autowired
    private OsastoService osastoService;

    @GetMapping("/osastot")
    public String showDepartments(Model model) {
        model.addAttribute("osastot", osastoService.list());
        return "redirect:/";
    }
    
    @PostConstruct
    public void init() {
        osastoService.add("Kahvilaitteet", 0);
        osastoService.add("Kulutustuotteet", 0);
    }
    @PostMapping("/osastot")
    public String addDepartment(String nimi, Integer osastoIDP) {
        osastoService.add(nimi, osastoIDP);
        return "redirect:/";
    }
}