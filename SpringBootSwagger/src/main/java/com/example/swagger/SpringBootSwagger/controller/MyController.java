package com.example.swagger.SpringBootSwagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/example/welcome")
    public String welcome() {
        return "Welcome to Spring Boot Swagger Example";
    }

    @GetMapping("/api/example/helloworld")
    public String helloWorld() {
        return "Hello World. Awesome !";
    }
}

