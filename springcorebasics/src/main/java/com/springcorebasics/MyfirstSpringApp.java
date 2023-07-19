package com.springcorebasics;

public class MyfirstSpringApp {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	void init()
	{
		System.out.println("Bean has initialized");
	}
	
	 void destroy()
	{
		System.out.println("Bean has been destroyed");
	}

}
