package com.java.hib;

import java.util.List;

public interface EmployDao {

	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addUser(Users users);
	int authenticate(Users users);
	long validate(Users users);
	List<String> showDepartments();
}
