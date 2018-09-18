package com.sample.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo1 extends GenericServlet{

	private static final long serialVersionUID = 7216157696652792071L;
	
	public void service(ServletRequest resquest, ServletResponse response) throws ServletException, IOException {
		
		ServletConfig servletConfig = this.getServletConfig();
		String ServletConfigParam = servletConfig.getInitParameter("ServletConfigParam");
		
		
		ServletContext servletContext = this.getServletContext();
		
		PrintWriter writer = response.getWriter();
		writer.append("Hi, Manish! this value is define in web.xml and it get by using servletConfig: "+ServletConfigParam);
		writer.append("\n");
		writer.append("servletContext.getInitParameter(\"username\") value: "+servletContext.getInitParameter("username"));		
		
	}

}
