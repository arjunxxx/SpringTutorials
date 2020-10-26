package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class BaseBallCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;

	

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

	

}
