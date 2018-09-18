package com.journaldev.jaxrs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.journaldev.jaxrs.model.Person;

public class PersonSub extends PersonServiceImpl{
	
	@GET
	@Path("{id}/getDummy4")
	public Person getDummyPerson4(@PathParam("id") int id) {
		if(id==101)
			throw new RuntimeException("hey hey hey 4");
		Person p = new Person();
		p.setAge(991);
		System.out.println("Name:"+name);
		p.setName(name);
		p.setId(id);
		persons.put(new Integer(id), p);
		return p;
	}
}
