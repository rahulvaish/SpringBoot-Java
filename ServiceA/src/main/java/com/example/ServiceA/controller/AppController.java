package com.example.ServiceA.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeoutException;

@Slf4j
@RestController
public class AppController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getDataServiceA")
    public ResponseEntity getDataServiceA() {
        log.info("In method getDataServiceA");
        try{
        String response = restTemplate.getForObject("http://localhost:8013/getDataServiceB", String.class);
        return ResponseEntity.ok(response);
        } catch (ResourceAccessException e) {
            log.error("Timeout occurred while calling Service B", e);
            return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body("Timeout occurred while calling Service B");
        }
    }
}
