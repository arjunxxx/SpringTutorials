package com.spring.demo;

public class BaseBallCoach implements ICoach {

	
	private IFortuneService fortuneService;
	private IFoodService foodService;
	private String email;
	private String phoneNumber;
	
	
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


	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getMailID() {
		return email;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
