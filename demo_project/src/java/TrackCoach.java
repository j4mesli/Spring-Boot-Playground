package com.example.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run a 5k in under 20 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

//	constructor
	public TrackCoach(FortuneService fortune) {
		this.fortuneService = fortune;
	}
	
//	init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
//	destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
	
}
