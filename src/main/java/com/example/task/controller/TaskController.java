package com.example.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@GetMapping(value="/admin")
	public String getValues() {
		return "Hello Friends";
		
	}

}
