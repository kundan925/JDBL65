package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hw")
public class HelloWorldController {
	@RequestMapping(value = "/test")
	public String test() {
		return "Welcome to the world of API.";
	}
	
	@RequestMapping("/hello")
	public String love() {
		return "Hello World!.";
	}
}
