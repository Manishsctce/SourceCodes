package com.ent.hibernate.collectionList;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Hibernate_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;
		Session session =null;
		try{
			sessionFactory = new Configuration()
	        		.configure("com\\ent\\hibernate\\collectionList\\hibernate.cfg.xml")
	        		.buildSessionFactory();
	         
			session = sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();

	        session.save(getUserDetails());
	        
	        tx.commit();
	        
	        Query q = session.createQuery("from UserDetails");
	        
	        q.getResultList().stream().forEach(ud -> displayUserDetails((UserDetails)ud));
		}finally{
			Optional.ofNullable(session).ifPresent(s -> s.close());
			Optional.ofNullable(sessionFactory).ifPresent(sf -> {
				sf.close();
				System.out.println("session factory closed");
			});
		}
	}
	
	public static UserDetails getUserDetails() {
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
		
		return user;
	}
	
	public static void displayUserDetails(UserDetails ud) {
		System.out.println(ud.getUserId()+ " "+ ud.getUserName());
		for(Address ad : ud.getListOfAddresses()) {
			System.out.println(ad.getStreet() +", "+ad.getCity()+", "+ad.getState()+"-"+ad.getPincode());
		}
	}
}
