package com.example.ChildService.controller;

import io.micrometer.observation.annotation.Observed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ChildController {
    //Use Resttemplate to call child
    final RestTemplate restTemplate;
    public ChildController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("/child")
    @Observed(
            name = "user.name",
            contextualName = "child-->Grandchild",
            lowCardinalityKeyValues = {"userType", "userType2"}
    )
    public String sayHi()
    {
        log.info("Child was called ...");
        log.info("Calling Grandchild now ...");
        String response = restTemplate.getForObject("http://localhost:5050/grandchild-svc/grandchild", String.class);
        return response;
    }
}
