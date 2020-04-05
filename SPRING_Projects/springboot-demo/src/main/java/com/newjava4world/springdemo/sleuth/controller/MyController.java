package com.newjava4world.springdemo.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class MyController {

	public static Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@RequestMapping("hello/{name}")
	public String sayHello(@PathVariable String name) {
		logger.info("Before");
		return "Hello " + name + ", how are you?";
	}
}
