package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 
    @Autowired
    public CustomerDAO dao;
 
    @RequestMapping("/getcustInfo")
    public List<Customer> customerInformation() {
        List<Customer> customers = dao.isData(); 
        return customers;
    }
}