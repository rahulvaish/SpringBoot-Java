package com.example.SpringBootValidation.controller;

import com.example.SpringBootValidation.model.CustomerOne;
import com.example.SpringBootValidation.model.CustomerResponse;
import com.example.SpringBootValidation.model.CustomerTwo;
import com.example.SpringBootValidation.utils.AppUtils;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {


    // If any validation fails in CustomerOne, 400 BAD REQUEST else process it!
    @PostMapping("/publishDataOne")
    public ResponseEntity<CustomerResponse> publishDataOne(@Valid @RequestBody CustomerOne customerOne){
        CustomerResponse customerResponse = new CustomerResponse();
        List<String> dataList = new ArrayList<>();
        dataList.add("A");
        dataList.add("B");
        dataList.add("C");
        dataList.add("D");
        customerResponse.setList(dataList);
        return ResponseEntity.ok(customerResponse);
    }

    //Custom Validation
    @PostMapping("/publishDataTwo")
    public ResponseEntity<CustomerResponse> publishDataTwo(@RequestBody CustomerTwo customerTwo) {
        List<String> verifyValidationList = new ArrayList<>();
        verifyValidationList = AppUtils.verifyValidation(customerTwo);
        CustomerResponse customerResponse = new CustomerResponse();

        if (verifyValidationList.size()==0) {
            List<String> dataList = new ArrayList<>();
            dataList.add("A");
            dataList.add("B");
            dataList.add("C");
            dataList.add("D");
            customerResponse.setList(dataList);
            return ResponseEntity.ok().body(customerResponse);
        }else{
            customerResponse.setErrorMessages(verifyValidationList);
            return ResponseEntity.badRequest().body(customerResponse);
        }
    }
}

