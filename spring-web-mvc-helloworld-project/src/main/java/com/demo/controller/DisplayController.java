package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	
	@RequestMapping("/display") // http://localhost:8080/spring-web-mvc-helloworld-project/display
	public String displayMessage() {
		return "message"; // viewResolver will resolve this to /WEB-INF/jsp/message.jsp
	}

}
