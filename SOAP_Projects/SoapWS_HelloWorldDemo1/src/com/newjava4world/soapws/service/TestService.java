package com.newjava4world.soapws.service;

import javax.xml.ws.Endpoint;

import com.newjava4world.soapws.api.impl.CalculatorServerImpl;

public class TestService {

	public static void main(String[] args) {
		/*Endpoint ep = Endpoint.create(new CalculatorServerImpl());	       
	    ep.publish("http://localhost:8081/calcServer");*/
		Endpoint ep = Endpoint.publish("http://localhost:8081/calcServer", new CalculatorServerImpl());
	}

}
