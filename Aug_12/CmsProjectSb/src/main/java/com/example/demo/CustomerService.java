package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> findAll() {
		return repo.findAll();
	}
	
	public Customer seachById(int id) {
	  return repo.findById(id).get();
	}
	
	public void addCustomer(Customer customer) {
		 repo.save(customer);
	}
}

