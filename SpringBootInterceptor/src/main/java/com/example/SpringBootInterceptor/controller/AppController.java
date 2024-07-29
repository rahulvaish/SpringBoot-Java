package com.example.SpringBootInterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/test1")
    public String testEndpoint1() {
        System.out.println("Business logic for /test1 is executed");
        return "Hello from /test1";
    }

    @GetMapping("/test2")
    public String testEndpoint2() {
        System.out.println("Business logic for /test2 is executed");
        return "Hello from /test2";
    }
}