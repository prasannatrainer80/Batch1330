package com.java.spr;

public class MessageImpl {

	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void show(String name) {
		System.out.println(msg+name);
	}
}
