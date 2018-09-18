package com.journaldev.jaxrs.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.journaldev.jaxrs.model.Person;
import com.journaldev.jaxrs.model.Response;

@Path("person")
//@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_JSON)
public class PersonServiceImpl implements PersonService {

	static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@DefaultValue("DefaultName")
	@QueryParam("name")
	public String name;
	
	@Override
	@POST
    @Path("/add")
	public Response addPerson(Person p) {
		Response response = new Response();
		if(persons.get(p.getId()) != null){
			response.setStatus(false);
			response.setMessage("Person Already Exists");
			return response;
		}
		persons.put(p.getId(), p);
		response.setStatus(true);
		response.setMessage("Person created successfully");
		return response;
	}

	@Override
	@GET
    @Path("/{id}/delete")
	public Response deletePerson(@PathParam("id") int id) {
		Response response = new Response();
		if(persons.get(id) == null){
			response.setStatus(false);
			response.setMessage("Person Doesn't Exists");
			return response;
		}
		persons.remove(id);
		response.setStatus(true);
		response.setMessage("Person deleted successfully");
		return response;
	}

	@Override
	@GET
	@Path("/{id}/get")
	public Person getPerson(@PathParam("id") int id) {
		return persons.get(id);
	}
	
	@GET
	@Path("{id}/getDummy")
	public Person getDummyPerson(@PathParam("id") int id) {
		Person p = new Person();
		p.setAge(99);
		System.out.println("Name"+name);
		p.setName("Manish2");
		p.setId(id);
		persons.put(new Integer(id), p);
		return p;
	}

	@GET
	@Path("/{id}/getDummy2")
	public Person getDummyPerson2(@PathParam("id") int id) {
		if(id==101)
			throw new RuntimeException("hey hey hey ");
		Person p = new Person();
		p.setAge(99);
		System.out.println("Name"+name);
		p.setName(name);
		p.setId(id);
		persons.put(new Integer(id), p);
		return p;
	}
	@Override
	@GET
	@Path("/getAll")
	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

}