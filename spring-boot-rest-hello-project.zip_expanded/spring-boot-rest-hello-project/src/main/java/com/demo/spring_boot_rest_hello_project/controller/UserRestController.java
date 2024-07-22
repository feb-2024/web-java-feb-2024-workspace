package com.demo.spring_boot_rest_hello_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_hello_project.pojo.UserPojo;

@RestController
public class UserRestController {

	@GetMapping("/get-user")
	public UserPojo getUserData() {
		UserPojo userPojo = new UserPojo(5001, "Will Smith", "Atlanta");
		return userPojo;
	}
}
