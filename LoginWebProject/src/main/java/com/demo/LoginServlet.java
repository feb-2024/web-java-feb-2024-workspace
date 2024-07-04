package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user");
		String password = request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		if("admin".equals(userName) && "admin".equals(password)) {
			printWriter.println("<h4>Login success!!</h4>");
		}else {
			printWriter.println("<h4>Login failed!!</h4>");
		}
		
		printWriter.println("<h3><a href=\"Login.html\">Go to Login Page...</a></h3>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
