package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Name.xml");
		NameDaoImpl impl1 = (NameDaoImpl)ctx.getBean("name1");
		System.out.println(impl1.show());
		NameDaoImpl impl2 = (NameDaoImpl)ctx.getBean("name2");
		System.out.println(impl2.show());
		NameDaoImpl impl3 = (NameDaoImpl)ctx.getBean("name3");
		System.out.println(impl3.show());
	}
}
