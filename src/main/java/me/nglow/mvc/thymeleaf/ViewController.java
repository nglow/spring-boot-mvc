package me.nglow.mvc.thymeleaf;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/hi")
    public String hello(Model model) {
        model.addAttribute("name", "nglow");
        return "hello";
    }
}
