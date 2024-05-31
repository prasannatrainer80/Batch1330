package com.java.jsp;

import java.util.Hashtable;
import java.util.Map;

public class LoginBean {

	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public boolean validate() {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Chandra", "Sekhar");
		userData.put("Sampath", "Sai");
		userData.put("Anil", "Varma");
		userData.put("Manohar", "Dukkola");
		userData.put("Rajesh", "Battula");
		String pwd = userData.getOrDefault(userName, "Not Found");
		System.out.println(userName);
		System.out.println(pwd);
		System.out.println(passWord);
		if (pwd.equals(passWord)) {
			return true;
		}
		return false;
	}
	public boolean validateMe() {
		if (userName.equals("Sonix") && passWord.equals("Sonix")) {
			return true;
		}
		return false;
	}
}
