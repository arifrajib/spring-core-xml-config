package com.arifrajib.springcorexml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from Spring application container
		Couch theCoutch = context.getBean("baseballCouch", Couch.class);
		
		//Call method on the bean
		System.out.println(theCoutch.getDailyWorkout());
		
		//Call dependency injected method
		System.out.println(theCoutch.getDailyFortune());
		
		//Close the application context
		context.close();

	}

}
