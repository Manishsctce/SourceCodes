package org.javabrains.koushik.hibernate.collectionSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate_Test {

	public static void main(String[] args) {
		
		Address homeAddress = new Address();
		homeAddress.setStreet("Home Street Name");
		homeAddress.setCity("Home City Name");	
		homeAddress.setState("MH");
		homeAddress.setPincode("411015");
		
		Address officeAddress = new Address();
		officeAddress.setStreet("Office Street Name");
		officeAddress.setCity("Office City Name");
		officeAddress.setState("MH");
		officeAddress.setPincode("411001");
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		user.getListOfAddresses().add(homeAddress);
		user.getListOfAddresses().add(officeAddress);
		
		SessionFactory factory = new Configuration()
        		.configure("org\\javabrains\\koushik\\hibernate\\collectionSet\\hibernate.cfg.xml")
        		.buildSessionFactory();
         
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(user);
        
        tx.commit();
        session.close();
        factory.close();
        System.out.println("session factory closed");
	}
}
