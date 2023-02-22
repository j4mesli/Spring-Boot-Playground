package com.example.demo;

import org.springframework.stereotype.Component;

// this below here is the BEAN ID REFERENCE
// @Component("thatTennisCoach")

@Component // this here is the default bean id (same id as class but tennisCoach) 
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}
}
