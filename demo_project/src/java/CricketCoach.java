package com.example.demo;

public class CricketCoach implements Coach {
	
//	properties
	private FortuneService fortuneService;
	private String email;
	private String team;
	
//	methods
	public String getEmail() { // email getter
		return email;
	}
	public void setEmail(String email) { // email setter
		System.out.println("Cricket Coach - inside setter method = setEmail");
		this.email = email;
	}
	public String getTeam() { // team getter
		return team;
	}
	public void setTeam(String team) { // team setter
		System.out.println("Cricket Coach - inside setter method = setTeam");
		this.team = team;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day!";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach - inside setter method = setFortuneService");
		this.fortuneService = fortuneService;
	}
	
//	constructor
	public CricketCoach() {
		System.out.println("Cricket Coach - inside no-arg constructor");
	}

}
