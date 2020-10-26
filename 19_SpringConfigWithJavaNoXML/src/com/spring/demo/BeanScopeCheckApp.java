package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeCheckApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfigDemo.class);
		ICoach coach=applicationContext.getBean("baseBallCoach",ICoach.class);
		System.out.println(coach.getDailyWorkout());
		applicationContext.close();

	}

}
