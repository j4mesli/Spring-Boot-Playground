package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String args[]) {
		
//		load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve the bean from our spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theSecondCoach = context.getBean("mySecondCoach", Coach.class);
		Coach theThirdCoach = context.getBean("myThirdCoach", Coach.class);
		
//		call methods on our bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theSecondCoach.getDailyWorkout());
		System.out.println(theThirdCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theSecondCoach.getDailyFortune());
		System.out.println(theThirdCoach.getDailyFortune());
		
//		close the context
		context.close();
		
	}
}
