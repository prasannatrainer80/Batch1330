package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientEx2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/bean2.xml");
		
		HelloWorld hw1 = (HelloWorld)ctx.getBean("hw");
		hw1.setName("Prasanna");
		hw1.show();
		
		HelloWorld hw2 = (HelloWorld)ctx.getBean("hw");
		hw2.setName("Raj");
		hw2.show();
		System.out.println(hw1.hashCode() + " " +hw2.hashCode());
	}
}
