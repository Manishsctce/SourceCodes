package com.journaldev.jaxrs.mapper;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable arg0) {
		System.out.println("##Exception:"+arg0.getMessage());
		ErrorMessages msg = new ErrorMessages(500, arg0.getMessage());
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(msg)
				.build();
	}
	
}
