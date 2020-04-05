package com.newjava4world.asynch.client;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Profile;

@Profile("asynchClient")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
