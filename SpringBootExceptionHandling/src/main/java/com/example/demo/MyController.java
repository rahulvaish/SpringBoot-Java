package com.example.demo;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	// @RequestMapping(value="/hi", method=RequestMethod.GET)
	@GetMapping(value = "/hi/{val1}/{val2}")
	public String function(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
		System.out.println(val1);
		System.out.println(val2);
		//System.out.print(Integer.parseInt(""));
		String s = null;
		System.out.print(s.length());
		return "hi";
	}

	
 	@ExceptionHandler
	public void npex(NullPointerException ex) {
		System.out.print(ex.getMessage()); 
	}
	//OR (Additionally define in Annotation definition)
	@ExceptionHandler(NullPointerException.class)
	public void npexception(NullPointerException ex) {
		System.out.print(ex.getMessage());
	}

	@ExceptionHandler
	public void nfex(NumberFormatException ex) {
		System.out.print(ex.getMessage());
	}

	@ExceptionHandler
	public void allex(Exception ex) {
		System.out.print(ex.getMessage());
	}
	
	
}
