package com.journaldev.jaxws.service;

public class WSException extends Exception{
	public WSException() {}
	
	public WSException(String str){
		super(str);
	}
	
	public WSException(Throwable t){
		super(t);
	}
	
	@Override
	public String toString() {
	
		return "WSException: "+super.toString();
	}
}
