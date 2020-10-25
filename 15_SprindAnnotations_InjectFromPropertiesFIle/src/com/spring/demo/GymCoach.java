package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements ICoach {

	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;
	
	@Value("${demo.name}")
	private String name;
	
	@Value("${demo.job}")
	private String job;
	


	@Override
	public String getWorkoutInstruction() {
		return "do weight trainings now ";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getJob() {
		return job;
	}


	@Override
	public String getFortuneMessageFromTeller() {
		return fortuneService.getFortuneMessage();
	}

}
