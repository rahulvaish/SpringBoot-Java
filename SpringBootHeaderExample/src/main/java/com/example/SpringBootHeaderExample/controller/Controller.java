package com.example.SpringBootHeaderExample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/listHeaders")
    public ResponseEntity<String> listAllHeaders(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println("KEY "+ key + "VALUE "+value);;
        });

        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
