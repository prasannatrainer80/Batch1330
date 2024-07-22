package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/greeting.xml");
		Greeting obj1 = (Greeting)ctx.getBean("bean1");
		System.out.println(obj1.showInfo("Rajesh"));
		
		Greeting obj2 = (Greeting)ctx.getBean("bean1");
		System.out.println(obj2.showInfo("Padma"));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
