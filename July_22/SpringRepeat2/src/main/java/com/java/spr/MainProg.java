package com.java.spr;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/bean.xml");
		Date date = new Date();
		MessageImpl bean1=null;
		int hr = date.getHours();
		if (hr >=6 && hr <12) {
			bean1 = (MessageImpl)ctx.getBean("message1");
		} else if (hr >=12 && hr <= 18) {
			bean1 = (MessageImpl)ctx.getBean("message2");
		} else if (hr > 18 && hr <= 22) {
			bean1 = (MessageImpl)ctx.getBean("message3");
		} 
		bean1.show("Rajesh");
	}
}
