package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping(value="/")
	public String sayHello() {
		return "Welcome to Spring Boot...";
	}
	
	@GetMapping(value="/karthik")
	public String karthik() {
		return "Hi I am Karthik...";
	}
	
	@GetMapping(value="/satish")
	public String satish() {
		return "Hi I am Sateesh...";
	}
	
}
