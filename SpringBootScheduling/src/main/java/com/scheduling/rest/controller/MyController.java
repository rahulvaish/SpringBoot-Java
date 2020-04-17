package com.scheduling.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scheduling.rest.service.Myservice;

@RestController
public class MyController 
{ 
	@Autowired
	Myservice myservice;
	
    @RequestMapping(value="/name/", method=RequestMethod.GET)
    public String getName() 
    {
    	System.out.print("Rahul ");
    	myservice.run();
        return "Rahul";
    }
    
   
}
