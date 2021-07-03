package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "this is home page";

    }
    @GetMapping("/admin")
    public String admin(){
        return "this is admin page";

    }





}
