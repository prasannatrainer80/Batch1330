package com.java.spr;

public class GreetingImpl implements Greeting {

	private String greetMsg;
	private String doingMsg;
	private String helpMsg;
	private String endMsg;
	
	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	public String getDoingMsg() {
		return doingMsg;
	}

	public void setDoingMsg(String doingMsg) {
		this.doingMsg = doingMsg;
	}

	public String getHelpMsg() {
		return helpMsg;
	}

	public void setHelpMsg(String helpMsg) {
		this.helpMsg = helpMsg;
	}

	public String getEndMsg() {
		return endMsg;
	}

	public void setEndMsg(String endMsg) {
		this.endMsg = endMsg;
	}

	@Override
	public String showInfo(String name) {
		// TODO Auto-generated method stub
		return greetMsg +name+"\n"+doingMsg +name+ "\n" +helpMsg +name+ 
				"\n" +endMsg +name;
	}

}
