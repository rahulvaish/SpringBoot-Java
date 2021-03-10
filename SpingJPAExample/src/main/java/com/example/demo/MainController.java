package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private CustomerRepository customersRepository;

	// ===============================================================================
	// There is no relation between names of ENDPOINT | METHOD NAME | REPO.METHOD
	// NAME
	// ===============================================================================

	@ResponseBody
	@RequestMapping("/showAllCustomers")
	public String listAllCustomers() {
		List<Customers> customers = this.customersRepository.getAllCustomersNames();

		for (Object cst : customers) {
			System.out.print(cst);
		}
		return "OK";
	}

	// WHEN YOU ARE INTERESTED TO PASS A VALUE IN YOUR QUERY:
	@ResponseBody
	@RequestMapping("/showAllCustomersByCountry")
	public String listAllCustomersByCountry() {
		List<Customers> customers = this.customersRepository.getAllCustomersByCountry("India");

		for (Object cst : customers) {
			System.out.print(cst);
		}
		return "OK";
	}

	// WHEN YOU ARE INTERESTED FOR NATIVE QUERY:
	@ResponseBody
	@RequestMapping("/showAllCustomersNativeWay")
	public String listAllCustomersNativeWay() {
		List<Customers> customers = this.customersRepository.getAllCustomersNamesNativeWay();

		for (Object cst : customers) {
			System.out.print(cst);
		}
		return "OK";
	}

	@ResponseBody
	@RequestMapping("/updateIranianCustomer")
	public void updateIranianCustomer() {
		this.customersRepository.updateIranianCustomer();
	}

	@ResponseBody
	@RequestMapping("/deleteIranianCustomer")
	public void deleteIranianCustomer() {
		this.customersRepository.deleteIranianCustomer();
	}

	@ResponseBody
	@RequestMapping("/insertIranianCustomerNativeWay")
	public void insertIranianCustomerNativeWay() {
		this.customersRepository.insertIranianCustomerNativeWay();
	}

}
