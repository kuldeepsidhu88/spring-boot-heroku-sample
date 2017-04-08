package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String home(){
		return "This is homepage!";
	}
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello from Heroku!";
	}
}
