package com.java.gen;

import java.util.ArrayList;
import java.util.List;

class Data<T, V> {
	
	public void show(T t, V v) {
		System.out.println("First Data-Type is  " +t.getClass().getSimpleName());
		System.out.println("Second Data-Type is  " +v.getClass().getSimpleName());
	}
}
public class GenIntExample1 {

	public static void main(String[] args) {
		Data<Integer, String> data1 = new Data<Integer, String>();
		data1.show(12, "Sonix");
		
		Data<String, Double> data2 = new Data<String, Double>();
		data2.show("Chandra", 88842.42);
		
	}
}
