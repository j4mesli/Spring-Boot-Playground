package com.example.demo;

public class BaseballCoach implements Coach {
	
//	properties
	private FortuneService fortuneService;
	
//	methods
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes of batting practice!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	constructor
	public BaseballCoach(FortuneService fortune) {
		this.fortuneService = fortune;
	}
}
