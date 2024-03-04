package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Chandra", "Sekhar");
		userData.put("Rama", "Anjaneyulu");
		userData.put("Anil", "Varma");
		userData.put("Padma", "Änjali");
		userData.put("Satish", "Gavini");
		
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password   ");
		pwd = sc.next();
		String res = userData.getOrDefault(user, "Not Found");
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
