package me.nglow.mvc.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    @CrossOrigin(origins = "http://localhost:18080")
    @GetMapping("/cors")
    public String hello() {
        return "Hello";
    }
}
