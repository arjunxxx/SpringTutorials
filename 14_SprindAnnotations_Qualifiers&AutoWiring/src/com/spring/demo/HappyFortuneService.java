package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortuneMessage() {
		return "well done my boy- Happy Fortune Service";
	}

}
