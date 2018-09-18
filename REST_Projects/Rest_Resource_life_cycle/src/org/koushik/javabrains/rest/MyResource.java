package org.koushik.javabrains.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Singleton //This is used to state that there will be only 1 instance of this class in container, so that 
public class MyResource {
	
	private int count;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		count = count + 1;
		return "It works! This method was called " + count + " time(s)";
	}
	
}
