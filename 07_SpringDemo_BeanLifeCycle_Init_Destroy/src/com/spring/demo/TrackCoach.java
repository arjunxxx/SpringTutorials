package com.spring.demo;

public class TrackCoach implements ICoach {

	
private IFortuneService fortuneService;


	
	public TrackCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "do track workout";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortueMessage();
	}

	
	public void myCustomInitMethod() {
		System.out.println("Inside init method ...............");
	}
	
	public void myCustomDestroyMethod() {
		System.out.println("Inside destroy method ...............");
	}
	

	

}
