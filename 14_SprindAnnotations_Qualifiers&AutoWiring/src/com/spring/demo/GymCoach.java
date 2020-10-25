package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements ICoach {

	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;
	
	


	@Override
	public String getWorkoutInstruction() {
		return "do weight trainings now ";
	}



	

	@Override
	public String getFortuneMessageFromTeller() {
		return fortuneService.getFortuneMessage();
	}

}
