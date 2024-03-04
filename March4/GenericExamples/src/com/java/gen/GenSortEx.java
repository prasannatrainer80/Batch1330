package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenSortEx {

	public static void main(String[] args) {
		Comparator<Student> cgpComparator = new CgpComparator();
		SortedSet<Student> studentList = new TreeSet<Student>(cgpComparator);
		studentList.add(new Student(1, "Ramaji", "Hyderabad", 8.2));
		studentList.add(new Student(2, "Mohammad", "Chennai", 9.0));
		studentList.add(new Student(3, "Satish", "Bangalore", 7.3));
		studentList.add(new Student(4, "Adilakshmi", "Pune", 9.1));
		studentList.add(new Student(5, "Manohar", "Mumbai", 8.3));
		studentList.add(new Student(6, "Anil", "Hyderabad", 8.9));
		studentList.add(new Student(7, "Likhith", "Delhi", 9.2));
		
		System.out.println("Student's List  ");
		for (Student student : studentList) {
			System.out.println(student);
		}
		
	}
}
