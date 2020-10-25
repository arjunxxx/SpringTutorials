package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class BeautifulFortuneService implements IFortuneService {

	@Override
	public String getFortuneMessage() {
		return "well done my boy-Beautiful Fortune Service";
	}

}
