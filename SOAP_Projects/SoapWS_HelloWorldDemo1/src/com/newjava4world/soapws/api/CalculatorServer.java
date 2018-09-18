package com.newjava4world.soapws.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorServer {
    @WebMethod
    int sum(int a, int b);
	
    @WebMethod
    int diff(int a, int b);

    @WebMethod
    int multiply(int a, int b);

    @WebMethod
    int divide(int a, int b);
}
