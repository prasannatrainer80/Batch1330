package com.java.customer;

public interface CustomerDao {

	String addCustomer(Customer customer);
	int validateOtp(String user, String otp);
}
