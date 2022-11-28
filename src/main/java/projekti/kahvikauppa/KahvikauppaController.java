package projekti.kahvikauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KahvikauppaController {
    @Autowired
    private TuoteRepository tuoteRepository;

    // @GetMapping("/kahvilaitteet")
    // public String view(Model model) {
    //     model.addAttribute("tuotteet", tuoteRepository.findAll());
    //     return "/kahvilaitteet";
    // }
}