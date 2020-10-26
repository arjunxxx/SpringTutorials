package com.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;

	@PostConstruct
	public void dummyInit() {
		System.out.println("inside dummy init TrackCoach method");
	}

	@PreDestroy
	public void dummyDestroy() {
		System.out.println("inside dummy destroy TrackCoach method");
	}

	@Override
	public String getDailyWorkout() {
		return "do track workout";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortueMessage();
	}

}
