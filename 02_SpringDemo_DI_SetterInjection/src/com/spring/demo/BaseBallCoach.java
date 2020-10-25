package com.spring.demo;

public class BaseBallCoach implements ICoach {

	
	private IFortuneService fortuneService;
	private IFoodService foodService;

	
	
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

	public void setFoodService(IFoodService foodService) {
		this.foodService = foodService;
	}

	@Override
	public String getFoodService() {
		return foodService.getFoodItem();
	}


}
