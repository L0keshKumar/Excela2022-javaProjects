package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class WelcomeControllers {

	@RequestMapping(value="/greet",method=RequestMethod.GET)
	@ResponseBody
	public String getMessage() {
		return "<h1 style='text-align:center'>Vanakam da mapula MVC la irunthu</h1>";
		
	}
	@RequestMapping(value="/bye",method=RequestMethod.GET)
	@ResponseBody
	public String sendMessage() {
		return "<h1 style='text-align:center'>Varataaa mamea durrr.....</h1>";
		
	}
}
