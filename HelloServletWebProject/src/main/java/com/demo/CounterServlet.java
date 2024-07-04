package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CounterServlet extends HttpServlet {
	private int counter;
	
	@Override
	public void init() throws ServletException {
		System.out.println("CounterServlet init() method called...");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CounterServlet doGet() method called...");
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		counter++;
		printWriter.println("<h3>You have visited " + counter + " times.</h3>");
	}

	@Override
	public void destroy() {
		System.out.println("CounterServlet destroy() method called...");
	}
}
