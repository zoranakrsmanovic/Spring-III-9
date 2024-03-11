package com.prvaapp123.prvaapp123;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index() {
        return "Pozdrav iz Spring Boot-a!";
    }
    @GetMapping("/bye")
    public String bye() {
        return "Dovidjenja";
    }

}