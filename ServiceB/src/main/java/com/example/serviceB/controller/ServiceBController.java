package com.example.serviceB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/b")
public class ServiceBController {

    @GetMapping("/serviceB")
    public String serviceB(){
        return "B";
    }

}
