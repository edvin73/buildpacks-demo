package com.edvin.projects.buildpacks_demo.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AppController {
		
	private static final String MESSAGE = "Hello, Buildpacks!";
	
	@GetMapping("/")
	public String hello() {
		return MESSAGE;
	}
	 
}
