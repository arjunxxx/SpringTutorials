package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortueMessage() {
	
		return "lucky day ";
	}

}
