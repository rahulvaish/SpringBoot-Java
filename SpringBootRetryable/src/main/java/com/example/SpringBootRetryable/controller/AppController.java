package com.example.SpringBootRetryable.controller;

import com.example.SpringBootRetryable.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/invoke")
    public String invokeRetryableMethod() {
        try {
            appService.retryableMethod();
            return "Retryable method invoked successfully";
        } catch (RuntimeException e) {
            return "Failed to invoke retryable method: " + e.getMessage();
        }
    }
}