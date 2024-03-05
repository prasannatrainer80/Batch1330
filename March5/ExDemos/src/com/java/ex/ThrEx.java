package com.java.ex;

import java.util.Scanner;

public class ThrEx {
	
	public void show(int choice) {
		if (choice < 0) {
			throw new ArithmeticException("Negative Numbers Not Allowed...");
		} else if (choice == 0) {
			throw new ArrayIndexOutOfBoundsException("Zero is Invalid Value...");
		} else {
			System.out.println("Choice Value is  " +choice);
		}
	}
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice   ");
		choice = sc.nextInt();
		ThrEx obj = new ThrEx();
		try {
			obj.show(choice);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from 1.30 AM Batch...");
		}
	}
}
