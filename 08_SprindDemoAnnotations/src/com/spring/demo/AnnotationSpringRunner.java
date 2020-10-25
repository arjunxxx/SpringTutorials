package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpringRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach=ac.getBean("gymCoach",GymCoach.class);
		System.out.println(coach.getWorkoutInstruction());

	}

}
