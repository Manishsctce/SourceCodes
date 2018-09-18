package com.newjava4world.soapws.api.impl;

import javax.jws.WebService;

import com.newjava4world.soapws.api.CalculatorServer;

@WebService(endpointInterface = "com.newjava4world.soapws.api.CalculatorServer")
//@WebService(endpointInterface = "com.javacodegeeks.examples.endpoint.CalculatorServer")//it will throw RuntimeModelerException
public class CalculatorServerImpl implements CalculatorServer {

	@Override
	  public int sum(int a, int b) {
	      return a+b;
	  }
	  
	  @Override
	  public int diff(int a, int b) {
	      return a-b;
	  }

	  @Override
	  public int multiply(int a, int b) {
	      return a*b;
	  }

	  @Override
	  public int divide(int a, int b) {
	      return a/b;
	  }
}
