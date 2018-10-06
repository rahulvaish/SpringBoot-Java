package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	 @Autowired
	    private CustomersRepository customersRepository;

	 @ResponseBody
	    @RequestMapping("/showCountries")
	    public String showAllCountries() {
	 
	        Iterable<Customers> customers = this.customersRepository.findAll();
	 
	        String html = "";
	        for (Customers cst : customers) {
	            html += cst.getCountry() + "<br>";
	        }
	 
	        return html;
	    }
	 
	 @RequestMapping("/findByCountry")
	    public String findByCountry() {
	 
	        Iterable<Customers> customers = this.customersRepository.findByCountry("USA");
	 
	        String html = "";
	        for (Customers cst : customers) {
	            html += cst.getCountry() + "<br>";
	        }
	 
	        return html;
	    }
	 
	 @RequestMapping("/findByCustName")
	    public String findByCust_name() {
	 
	        Iterable<Customers> customers = this.customersRepository.findByCustName("WOLF");
	 
	        String html = "";
	        for (Customers cst : customers) {
	            html += cst.getCustName() + "<br>";
	        }
	 
	        return html;
	    }
}
