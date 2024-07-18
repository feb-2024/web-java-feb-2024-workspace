package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello") // http://localhost:8080/spring-web-mvc-helloworld-project/hello
	public String sayHello() {
		return "<h2>Hello Controller method called...</h2>";
	}
}
