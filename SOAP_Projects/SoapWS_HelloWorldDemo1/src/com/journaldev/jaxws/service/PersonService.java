package com.journaldev.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.journaldev.jaxws.beans.Address;
import com.journaldev.jaxws.beans.Person;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface PersonService {

	@WebMethod
	public boolean addPerson(@WebParam(name="person")Person p,@WebParam(name="addr")Address addr) throws WSException;
	
	@WebMethod
	public boolean deletePerson(int id) throws WSException;
	
	@WebMethod
	public Person getPerson(@WebParam(name="personId")int id)  throws WSException;
	
	@WebMethod
	public Person[] getAllPersons()  throws WSException;
}