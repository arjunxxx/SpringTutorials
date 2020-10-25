package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements ICoach {

	@Override
	public String getWorkoutInstruction() {
		return "do weight trainings now ";
	}

}
