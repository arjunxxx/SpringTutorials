package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:demo.properties")
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
