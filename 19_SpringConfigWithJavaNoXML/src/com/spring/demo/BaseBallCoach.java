package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;

	

	@Override
	public String getDailyWorkout() {
		return "baseball workout";
	}
	
	@Override
	public String getFortuneService() {
		return fortuneService.getFortueMessage();
	}

	

}
