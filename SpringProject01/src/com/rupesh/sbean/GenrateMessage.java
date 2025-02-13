package com.rupesh.sbean;

public class GenrateMessage 
{
	private String message;

	public GenrateMessage() {
		System.out.println("Object will be created!!!");
		}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage() {
		System.out.println("Message :"+message);
	}

	
	
}
