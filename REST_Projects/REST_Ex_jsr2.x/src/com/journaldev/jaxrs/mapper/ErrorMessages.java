package com.journaldev.jaxrs.mapper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessages {
	private String errorMessage;
	private int errorCode;
	
	public ErrorMessages(){
		
	}
	public ErrorMessages(int errorCode, String errorMessage){
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
