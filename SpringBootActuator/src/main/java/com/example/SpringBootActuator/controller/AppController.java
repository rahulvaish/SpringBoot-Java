package com.example.SpringBootActuator.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/getData")
    public String getData(){
        return "Data";
    }
}
