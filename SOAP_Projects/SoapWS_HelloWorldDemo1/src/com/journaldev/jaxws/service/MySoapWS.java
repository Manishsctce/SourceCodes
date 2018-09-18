package com.journaldev.jaxws.service;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.journaldev.jaxws.beans.Address;
import com.journaldev.jaxws.beans.Person;

@WebService
public class MySoapWS {
	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	public boolean addPerson(@WebParam(name="person") Person p, @WebParam(name="addr")Address addr) throws WSException{		
		
		if(persons.get(p.getId()) == null)
			throw new WSException("Not found!");
		
		if(persons.get(p.getId()) != null) 
			return false;
		persons.put(p.getId(), p);
		return true;
	}
}
