package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeCheckApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		ICoach coach1=applicationContext.getBean("myCoach",ICoach.class);
		ICoach coach2=applicationContext.getBean("myCoach",ICoach.class);
		
		Boolean scopeCheck=coach1==coach2;
		System.out.println("Coach1 & Coach2 referencing to same object "+scopeCheck);
		System.out.println("Printing Object of Coach1 "+coach1);
		System.out.println("Printing Object of Coach2 "+coach2);
		applicationContext.close();

	}

}
