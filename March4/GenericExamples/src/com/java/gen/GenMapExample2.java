package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMapExample2 {

	public static void main(String[] args) {
		Map<String, Double> mapData = new Hashtable<String, Double>();
		mapData.put("Manohar", 98484.22);
		mapData.put("Padmanjali", 98831.22);
		mapData.put("Naveen", 78944.22);
		mapData.put("Satish", 86642.22);
		mapData.put("Adilakshmi", 81142.22);
		mapData.put("Ganesh", 78932.22);
		
		String key;
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key = sc.next();
		result = mapData.getOrDefault(key, 0.0);
		System.out.println(result);
	}
}
