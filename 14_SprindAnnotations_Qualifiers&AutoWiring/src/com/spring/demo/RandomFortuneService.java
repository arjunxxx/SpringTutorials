package com.spring.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {
	
	private String[] randomMessage= {"bla bla bla ","lucky day for u ","just escaped","u act foolish"};

	private Random rd= new Random();
	
	@Override
	public String getFortuneMessage() {
		
		int index=rd.nextInt(randomMessage.length);		
		return randomMessage[index];
	}

}
