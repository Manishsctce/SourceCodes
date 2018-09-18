package com.sample.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo1 implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		PrintWriter writer = response.getWriter();
		writer.append("\nBefore filter\n");
		
		filterChain.doFilter(request, response);
		
		writer.append("\nafter filter\n");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
