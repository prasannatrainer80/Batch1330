package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping(value="/showCustomer")
	public List<Customer> showCustomer() {
		return service.findAll();
	}
	
	@GetMapping(value="/searchCustomer/{id}")
	public Customer searchById(@PathVariable int id) {
		return service.seachById(id);
	}
	
	@PostMapping(value="/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
	public String postMethodName(@RequestBody String entity) {
		//TODO: process POST request
		
		return entity;
	}
	
}
