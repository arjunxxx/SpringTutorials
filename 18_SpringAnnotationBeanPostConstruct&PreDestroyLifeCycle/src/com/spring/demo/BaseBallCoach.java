package com.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;

	@PostConstruct
	public void dummyInit() {
		System.out.println("inside dummy init BaseBallCoach method");
	}

	@PreDestroy
	public void dummyDestroy() {
		System.out.println("inside dummy destroy BaseBallCoach method");
	}

	@Override
	public String getDailyWorkout() {
		return "baseball workout";
	}
	
	@Override
	public String getFortuneService() {
		return fortuneService.getFortueMessage();
	}

	

}
