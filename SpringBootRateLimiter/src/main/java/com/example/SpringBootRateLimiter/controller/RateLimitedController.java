package com.example.SpringBootRateLimiter.controller;

import com.example.SpringBootRateLimiter.service.RateLimiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitedController {

    @Autowired
    private RateLimiterService rateLimiterService;

    @GetMapping("/api/resource")
    public ResponseEntity<String> getResource() {
        if (rateLimiterService.tryAcquire()) {
            System.out.println("Resource accessed successfully");
            return ResponseEntity.ok("Resource accessed successfully");
        } else {
            // Too many requests, return 429 Too Many Requests status code
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("Rate limit exceeded");
        }
    }
}