package com.example.Application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${server.instance.id}")
    String instanceId;

    @GetMapping("/getData")
    public String getData() {
        return String.format("Hello from instance %s", instanceId);
    }
}