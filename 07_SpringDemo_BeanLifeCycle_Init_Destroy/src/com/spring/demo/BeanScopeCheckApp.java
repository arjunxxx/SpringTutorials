package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeCheckApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beanScopeApplicationContext.xml");
		ICoach coach = applicationContext.getBean("myCoach", ICoach.class);
		
		System.out.println(coach.getDailyWorkout());
		applicationContext.close();
	
	}

}
