package com.spring.demo;

public class MyApp {

	public static void main(String[] args) {
		
		ICoach bc= new TrackCoach(new HappyFortuneService());
		System.out.println(bc.getDailyWorkout());
		

	}

}
