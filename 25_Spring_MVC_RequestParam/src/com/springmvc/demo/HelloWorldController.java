package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {		
		return "helloworld-form";
	}
	
	
	
	//controller method top process form
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("username") String uName,Model model) {
		
		
		String result="Hey "+ uName.toUpperCase();
		
		model.addAttribute("message",result);
		return "login-page";
	}
	

}
