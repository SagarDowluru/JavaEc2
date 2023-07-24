package com.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class AwsDemoController {

	
	@GetMapping("/go")
	public String getAccess() {
		
		
		return "Working fine.....!";
		
	}
}
