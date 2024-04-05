package com.example.SpringBootValidation.controller;

import com.example.SpringBootValidation.model.Customer;
import com.example.SpringBootValidation.model.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AppController {


    // If any validation fails in CustomerOne, 400 BAD REQUEST else process it! - BUT NO IDEA WHAT FAILED
    @PostMapping("/publishDataOne")
    public ResponseEntity<CustomerResponse> publishDataOne(@Valid @RequestBody Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        List<String> dataList = new ArrayList<>();
        dataList.add("A");
        dataList.add("B");
        dataList.add("C");
        dataList.add("D");
        customerResponse.setList(dataList);
        return ResponseEntity.ok(customerResponse);
    }


    @PostMapping("/publishDataTwo")
    public ResponseEntity<?> publishDataTwo(@Validated @RequestBody Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // If there are validation errors, return a 400 Bad Request response
            Map<String, String> errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(errors);
        }

        // If validation passes, proceed with creating the user
        CustomerResponse customerResponse = new CustomerResponse();
        List<String> dataList = new ArrayList<>();
        dataList.add("A");
        dataList.add("B");
        dataList.add("C");
        dataList.add("D");
        customerResponse.setList(dataList);
        return ResponseEntity.ok(customerResponse);
    }

}

