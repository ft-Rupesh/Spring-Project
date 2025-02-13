package com.rupesh.sbean;

public class HelloWorld 
{
	private String message;
	public HelloWorld() {System.out.println("Hi");}
	public void setMessage(String message) {
		this.message=message;
	}
	public void getMessage() {
		System.out.println("Message :"+message);
	}
}
