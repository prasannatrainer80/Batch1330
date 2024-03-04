package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> mapData = new Hashtable<Integer, String>();
		mapData.put(1, "Rajesh");
		mapData.put(2, "Padmanjali");
		mapData.put(3, "Naveen");
		mapData.put(4, "Sampath");
		mapData.put(5, "Sirish");
		
		int key;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key = sc.nextInt();
		result = mapData.getOrDefault(key, "Not Found...");
		System.out.println(result);
		
	}
}
