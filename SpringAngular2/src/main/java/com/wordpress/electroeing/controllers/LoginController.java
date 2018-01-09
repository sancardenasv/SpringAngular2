package com.wordpress.electroeing.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping
	public String testMethod() {
		return "Hello There";
	}

}
