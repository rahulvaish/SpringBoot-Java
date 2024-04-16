package com.example.ServiceA.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AppController {

    @Value("${value.firstName}")
    String firstName;
    @Value("${value.lastName}")
    String lastName;

    @GetMapping("/getFirstName")
    public String getFirstName() {
        return "First Name: " + firstName;
    }
    @GetMapping("/getLastName")
    public String getLastName() {
        return "Last Name: " + lastName;
    }
}
