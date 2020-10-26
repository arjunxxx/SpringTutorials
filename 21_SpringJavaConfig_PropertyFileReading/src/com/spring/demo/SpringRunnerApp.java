package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunnerApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfigDemo.class);
		ICoach coach=applicationContext.getBean("baseBallCoach",ICoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getEmail());
		System.out.println(coach.getPhoneNumber());
		applicationContext.close();

	}

}
