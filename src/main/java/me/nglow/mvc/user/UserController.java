package me.nglow.mvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/users/create")
    // @RestController를 사용하면 return type 앞에 @ResponseBody를 생략할 수 있음
    public User create(@RequestBody User user) {
         return user;
    }
}
