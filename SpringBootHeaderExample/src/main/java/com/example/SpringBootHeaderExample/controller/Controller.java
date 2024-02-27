package com.example.SpringBootHeaderExample.controller;

import model.Book;
import model.Book_V1;
import model.Book_V2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {

    @PostMapping(value = "/postBook")
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        // Handle version 1 logic
        System.out.println("ORIGINAL FLOW");
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @PostMapping(value = "/postBook", headers = {"API-Version=1"})
    public ResponseEntity<String> createBookV1(@RequestBody Book_V1 bookv1) {
        // Handle version 1 logic
        System.out.println("VERSION#1 FLOW");
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @PostMapping(value = "/postBook", headers = {"API-Version=2"})
    public ResponseEntity<String> createBookV2(@RequestBody Book_V2 bookv2) {
        // Handle version 2 logic
        System.out.println("VERSION#2 FLOW");
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
