package com.java.project;

import java.util.List;

public class EmployBal {

	static EmployDao dao = new EmployDaoImpl();
	static StringBuilder sb = new StringBuilder();
	
	public boolean doValid(Employ employ) {
		boolean flag = true;
		if (employ.getEmpno() <= 0) {
			sb.append("Negative Numbers not Allowed as Employ Id...\n");
			flag = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Name contains min. 5 characters...\n");
			flag = false;
		}
//		System.out.println(employ.getGender());
//		if (employ.getGender()!="MALE" || 
//				employ.getGender() != "FEMALE"
//				) {
//			sb.append("Gender is Either MALE or FEMALE...\n");
//			flag = false;
//		}
			
		if (employ.getBasic() < 10000 || employ.getBasic() > 90000) {
			sb.append("Salary must be between 10000 and 90000...");
			flag = false;
		}
		return flag;
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (doValid(employ)==true) {
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
}
