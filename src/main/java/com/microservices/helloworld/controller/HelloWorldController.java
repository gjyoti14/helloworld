package com.microservices.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value="/hw/helloworld")
	public String helloWorld(){
		return "Hello World!!";
	}
}
