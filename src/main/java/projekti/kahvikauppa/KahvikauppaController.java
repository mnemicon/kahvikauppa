package projekti.kahvikauppa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KahvikauppaController {
    
    @GetMapping("/kahvikauppa")
    @ResponseBody
    public String home() {
        return "Tänne tulee kahvikauppa!";
    }
}
