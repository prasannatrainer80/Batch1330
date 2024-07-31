package com.java.spr.dao;

import java.util.List;

import com.java.spr.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	Employ searchEmploy(int empno);
	void updateEmploy(Employ employUpdated);
	void deleteEmploy(int empno);
	void addEmploy(Employ employNew);
}
