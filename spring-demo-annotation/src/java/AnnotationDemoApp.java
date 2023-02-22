package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		
//		read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		get bean from Spring container USING THE ANNOTATION IN THE TENNIS COACH FILE
//		Coach theCoach = context.getBean("thatTennisCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
//		call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyWorkout());
		
//		close the context
		context.close();
		
	}
}
