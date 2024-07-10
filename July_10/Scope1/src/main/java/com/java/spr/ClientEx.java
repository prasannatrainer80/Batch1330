package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientEx {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/bean.xml");
		
		HelloWorld hw1 = (HelloWorld)ctx.getBean("beanHelloWorld");
		hw1.setName("Prasanna");
		hw1.show();
		
		HelloWorld hw2 = (HelloWorld)ctx.getBean("beanHelloWorld");
		hw2.setName("Raj");
		hw2.show();
		System.out.println(hw1.hashCode() + " " +hw2.hashCode());
	}
}
