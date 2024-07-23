package com.demo.spring_boot_rest_hello_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello everyone!";
	}
	
	
}
