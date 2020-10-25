package com.spring.demo;

public class BaseBallCoach implements ICoach {

	
	private IFortuneService fortuneService;

	
	public BaseBallCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
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
