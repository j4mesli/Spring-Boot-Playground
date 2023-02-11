package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
//		load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve bean from spring container
		CricketCoach coach = context.getBean("myFourthCoach", CricketCoach.class);
		
//		call methods from bean		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
//		call our own methods to get literal values
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
//		close context
		context.close();
		
	}

}
