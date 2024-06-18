package com.java.hib;

import java.util.Scanner;

public class EmploySearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		EmployDao dao = new EmployDaoImpl();
		Employ employFound = dao.searchEmployDao(empno);
		if (employFound!=null) {
			System.out.println(employFound);
		}
	}
}
