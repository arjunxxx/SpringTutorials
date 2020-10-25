package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpringRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach=ac.getBean("gymCoach",GymCoach.class);
		System.out.println(coach.getWorkoutInstruction());
		System.out.println(coach.getFortuneMessageFromTeller());
		System.out.println("printing name and job from propeties file "+ coach.getName()+" "+coach.getJob());

	}

}
