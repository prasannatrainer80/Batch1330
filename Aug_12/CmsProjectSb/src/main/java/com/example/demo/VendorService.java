package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

	@Autowired
	private VendorRepository repo;
	
	public List<Vendor> showVendor() {
		return repo.findAll();
	}
	
	public Vendor searchVenor(int id) {
		return repo.findById(id).get();
	}
	
	public void addVendor(Vendor vendor) {
		repo.save(vendor);
	}
}
