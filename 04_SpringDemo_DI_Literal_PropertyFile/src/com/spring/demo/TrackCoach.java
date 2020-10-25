package com.spring.demo;

public class TrackCoach implements ICoach {

	
private IFortuneService fortuneService;
private IFoodService foodService;
private String email;
private String phoneNumber;
	
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
