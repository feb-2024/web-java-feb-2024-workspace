package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime dateTime = LocalDateTime.now();
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h2>The server date and time is : </h2><h4>" + dateTime + "</h4>");
	}
}
