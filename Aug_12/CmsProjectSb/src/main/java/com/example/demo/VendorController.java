package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/vendor")
public class VendorController {

	@Autowired
	private VendorService service;
	
	@GetMapping(value="/showVendor")
	public List<Vendor> showVendor() {
		return service.showVendor(); 
	}
	
	@GetMapping(value="/searchVendor/{id}")
	public Vendor searchVendor(@PathVariable int id) {
		return service.searchVenor(id);
	}
	
	@PostMapping(value="/addVendor")
	public void addVendor(@RequestBody Vendor vendor) {
		service.addVendor(vendor);
	}
	
	
}
