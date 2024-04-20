package com.example.serviceA.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/a")
public class ServiceAController {

    @GetMapping("/serviceA")
    @CircuitBreaker(name = "serviceA", fallbackMethod = "serviceAFallBack")
    public String serviceA(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8091/b/serviceB", String.class);
    }

    public String serviceAFallBack(Exception e){
        return "FB for Service A";
    }

}
