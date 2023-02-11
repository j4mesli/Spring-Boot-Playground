package com.example.demo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run 10 Philly Specials!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	constructor
	public FootballCoach(FortuneService fortune) {
		this.fortuneService = fortune;
	}
}
