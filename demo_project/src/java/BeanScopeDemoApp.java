package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
//		load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
//		retrieve beans from Spring container (need to grab by id value in XML)
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
//		check if two beans are equivalent
		boolean result = theCoach == alphaCoach;
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
//		close the context
		context.close();
	}
}
