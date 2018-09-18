package org.javabrains.koushik.hibernate.embeddedObject;

import java.util.List;

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
		user.setHomeAddress(homeAddress);		
		user.setOfficeAddress(officeAddress);
		
		SessionFactory factory = new Configuration()
        		.configure("org\\javabrains\\koushik\\hibernate\\embeddedObject\\hibernate.cfg.xml")
        		.buildSessionFactory();
         
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(user);
        tx.commit();
        System.out.println("Before save: ");
        List list = session.createQuery("from UserDetails").list();
        for(Object obj : list){
        	UserDetails ud = (UserDetails)obj;
        	System.out.println(ud.getUserId()+":"+ud.getUserName());
        }
        session.evict(user);
        System.out.println("After save: ");
        user.setUserName("Manish");
        session.saveOrUpdate(user);
        list = session.createQuery("from UserDetails").list();
        for(Object obj : list){
        	UserDetails ud = (UserDetails)obj;
        	System.out.println(ud.getUserId()+":"+ud.getUserName());
        }
        session.close();
        factory.close();
	}
}
