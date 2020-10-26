package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigDemo {
	
	@Bean
	public IFortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	

	@Bean
	public ICoach baseBallCoach() {
		return new BaseBallCoach(happyFortuneService());
	}
	
	
}
