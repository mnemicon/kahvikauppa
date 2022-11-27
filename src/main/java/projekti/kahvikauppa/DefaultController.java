package projekti.kahvikauppa;

import org.springframework.web.bind.annotation.GetMapping;

public class DefaultController {
    
    @GetMapping("*")
    public String showMainPage() {
        return "index";
    }
}