package com.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.model.UserPojo;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;


public class LoginController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("pass");
		UserPojo userPojo = new UserPojo(user, password);
		
		LoginService loginService = new LoginServiceImpl();
		
		boolean result = loginService.validate(userPojo);
		
		if(result == true) {
			// login success and forward to jsp page
			// do no write login success in the servlet's PrintWriter
			
		}else {
			// login failed and forward to a jsp page
			// do no write login failed in the servlet's PrintWriter
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
