package com.security.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class MyController 
{
   
    
    @RequestMapping(value="/library/", method=RequestMethod.GET)
    public String getlib() 
    {
    	System.out.print("Rahul ");
        return "Rahul";
    }
    
    @RequestMapping(value="/library/books/", method=RequestMethod.GET)
    public String getbooks() 
    {
    	System.out.print("Vaish");
        return "Vaish";
    }
    
    
}
