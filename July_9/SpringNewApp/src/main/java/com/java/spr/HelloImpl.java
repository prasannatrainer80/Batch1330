package com.java.spr;

public class HelloImpl implements Hello {

	private String greeting;
	private String company;
	private String topic;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String sayHello(String name) {
		return greeting +name+ "\n and today we started with Topic  " +topic + 
				"\n This class is happening from company " +company + "\n Happy Learning...";
	}

}
