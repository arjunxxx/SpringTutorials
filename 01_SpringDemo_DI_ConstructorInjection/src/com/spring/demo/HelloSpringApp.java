package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach = ac.getBean("myCoach",ICoach.class);	
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
		ac.close();

	}

}
