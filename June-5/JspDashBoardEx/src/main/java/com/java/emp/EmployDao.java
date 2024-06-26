package com.java.emp;

import java.sql.SQLException;
import java.util.List;

public interface EmployDao {
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employNew) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
	String addEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	int login(String user, String pwd) throws ClassNotFoundException, SQLException;
}
