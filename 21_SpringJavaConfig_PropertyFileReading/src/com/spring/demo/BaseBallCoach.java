package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class BaseBallCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;

	
	@Value("${demo.email}")
	private String email;
	
	@Value("${demo.phoneNumber}")
	private String phoneNumber;
	

	public BaseBallCoach(IFortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "baseball workout";
	}
	
	@Override
	public String getFortuneService() {
		return fortuneService.getFortueMessage();
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	

}
