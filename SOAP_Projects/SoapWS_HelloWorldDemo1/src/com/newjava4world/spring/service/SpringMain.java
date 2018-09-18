package com.newjava4world.spring.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ctx.close();
		ctx.registerShutdownHook();
	}

}
