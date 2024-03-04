package com.java.gen;

import java.util.Comparator;

public class CgpComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getCgp() >= s2.getCgp()) {
			return 1;
		}
		return -1;
	}

}
