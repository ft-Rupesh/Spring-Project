package com.rupesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rupesh.sbean.HelloWorld;

public class MainApp 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext
		("com/rupesh/conf/applicationcontext.xml");
		HelloWorld object = (HelloWorld) context.getBean("helloWorld");
		object.getMessage();
	}
}
