package com.arifrajib.springcorexml;

public class BaseballCoach implements Couch {

	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//Define constructure for dependency injection
	public BaseballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune 
		return fortuneService.getFortune();
	}
	
	public void sayWelcomeStartup() {
		System.out.println("Init Method is booting up");
	}
	
	public void sayByeMessage() {
		System.out.println("Destry Method, Say bye.");
	}

}