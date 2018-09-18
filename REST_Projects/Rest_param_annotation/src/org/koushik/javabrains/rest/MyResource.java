package org.koushik.javabrains.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.TEXT_HTML)
public class MyResource {

	@GET
	@Path("hello/{name}")
	@Produces(MediaType.TEXT_PLAIN)// It override the default TEXT_HTML media type and produce plain text
	//@Produces(MediaType.TEXT_HTML)
	public String sayHello(@PathParam("name") String name) {		
		return "Hey "+ name;
	}
	
	@GET
	@Path("employee/{id}")
	@Produces("text/html")
	public String getEmployee(@PathParam("id") Employee emp){
		return emp.toString();
	}
	
	@GET
	@Produces(value = { MediaType.TEXT_PLAIN, "text/shortdate" })
	public Date testMethod() {
		return Calendar.getInstance().getTime();
	}
}
