package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Person.xml");
		Person person1 = (Person)ctx.getBean("beanMeghana");
		person1.showAll();
		
		Person person2 = (Person)ctx.getBean("beanKarthik");
		person2.showAll();
		
		Person person3 = (Person)ctx.getBean("beanAnil");
		person3.showAll();
	}
}
