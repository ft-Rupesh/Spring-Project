package com.rupesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rupesh.sbean.GenrateMessage;

public class MainApp
{
	public static void main(String[] args) {
		 
		ApplicationContext context  = new ClassPathXmlApplicationContext
				("com/rupesh/conf/bean.xml");
		GenrateMessage object=(GenrateMessage)
		context.getBean("helloWorld");
		object.getMessage();
	}
}
