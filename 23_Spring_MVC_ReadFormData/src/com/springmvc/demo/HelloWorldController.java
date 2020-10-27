package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {		
		return "helloworld-form";
	}
	
	
	
	//controller method top process form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "login-page";
	}
	

}
