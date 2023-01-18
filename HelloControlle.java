package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class HelloControlle {

    @GetMapping("/hello")
    public String getHello(Model model) {
        model.addAttribute("message", "Rajesh Shet");
        return "hello";
    }

}
