package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.UserPojo;
import com.demo.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginServiceImpl;

	//http://localhost:8080/spring-web-mvc-login-project
	@GetMapping("/")
	public String getLoginPage() {
		return "Login";
	}
	
	//http://localhost:8080/spring-web-mvc-login-project/validate-user
	@PostMapping("/validate-user")
	public String validateUser(HttpServletRequest request) {
		String user = request.getParameter("userName");
		String pass = request.getParameter("password");
		UserPojo userDetails = new UserPojo(user, pass);
		
		boolean result = loginServiceImpl.validate(userDetails);
		
		if(result) {
			return "LoginSuccess";
		}else {
			return "LoginFailure";
		}			
	}
}
