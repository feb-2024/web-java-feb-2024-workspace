package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		int number1 = Integer.parseInt(n1);
		int number2 = Integer.parseInt(n2);
		
		int answer = number1 + number2;
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<p><h4>The sum of " + n1 + " and " + n2 + " is " + answer +"</h4><p>" );
		printWriter.println("<p><a href=\"Add.html\">Back to Add page...</a></p>");
		
	}

}
