package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployService {

	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Karthik", "Java", "Programmer", 99423.44));
		employList.add(new Employ(2, "Chandra Sekhar", "Dotnet", "Programmer", 99423.44));
		employList.add(new Employ(3, "Satish", "Angular", "Programmer", 99423.44));
		employList.add(new Employ(4, "Rajesh", "Java", "Programmer", 99423.44));
		employList.add(new Employ(5, "Varalakshmi", "React", "Programmer", 99423.44));
		employList.add(new Employ(6, "Sirisha", "Angular", "Programmer", 99423.44));
		
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public Employ searchEmploy(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
			}
		}
		return employFound;
	}
}
