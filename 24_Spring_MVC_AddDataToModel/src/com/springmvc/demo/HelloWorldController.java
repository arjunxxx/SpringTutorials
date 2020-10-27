package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String processForm(HttpServletRequest req,Model model) {
		
		String name = req.getParameter("username");
		String result="Hey "+ name.toUpperCase();
		
		model.addAttribute("message",result);
		return "login-page";
	}
	

}
