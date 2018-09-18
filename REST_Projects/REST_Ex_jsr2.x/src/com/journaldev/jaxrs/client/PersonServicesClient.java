package com.journaldev.jaxrs.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.journaldev.jaxrs.model.Person;
import com.journaldev.jaxrs.model.Response;
import com.journaldev.jaxrs.service.PersonService;
import com.journaldev.jaxrs.service.PersonServiceImpl;


public class PersonServicesClient {
	public static void main(String[] args) {
		Person p1 = new Person(1,"Manish",29);
		PersonService personService = new PersonServiceImpl();
		personService.addPerson(p1);
		System.out.println("Added : "+p1);
		
		
/*		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		
		ClientResponse response = service.path("person").path("add")
				 .type(MediaType.APPLICATION_XML)
				 .post(ClientResponse.class, p1);
		
		 System.out.println(response.getStatus());
		 if (response.getStatus() == 200) {
			 System.out.println("Create User Success");
		 } else {
			 System.out.println("Create User Failed");
		 }
*/
		ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget webTarget = client.target(getBaseURI());

        String response = webTarget.path("rest")
        			.path("person/11/getDummy")
        			//.path("11").path("getDummy")
        			.request()
        			.accept(MediaType.APPLICATION_XML)
        			.get(Person.class).toString();
        
        webTarget.path("rest").path("person/add");
        
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML); 
        
        javax.ws.rs.core.Response response1 = invocationBuilder.post(Entity.entity(p1, MediaType.APPLICATION_XML));  
        

        System.out.println(response);
        System.out.println(response1.getStatus());
        //System.out.println(response1.readEntity(Person.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/REST_Ex_jsr2.x/").build();
	}
}
