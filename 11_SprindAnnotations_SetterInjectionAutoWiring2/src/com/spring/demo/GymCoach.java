package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements ICoach {

	
	private IFortuneService fortuneService;
	
	


	@Override
	public String getWorkoutInstruction() {
		return "do weight trainings now ";
	}


	@Autowired
	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService=fortuneService;
				
	}
	

	@Override
	public String getFortuneMessageFromTeller() {
		return fortuneService.getFortuneMessage();
	}

}
