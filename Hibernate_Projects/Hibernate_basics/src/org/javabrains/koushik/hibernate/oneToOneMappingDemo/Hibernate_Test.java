package org.javabrains.koushik.hibernate.oneToOneMappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate_Test {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("mY Verna");
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		user.setVehicle(vehicle);
		
		SessionFactory factory = new Configuration()
        		.configure("org\\javabrains\\koushik\\hibernate\\oneToOneMappingDemo\\hibernate.cfg.xml")
        		.buildSessionFactory();
         
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        //session.persist(vehicle);
        session.save(user);
        
        tx.commit();
        session.close();
        
      
        factory.close();
        System.out.println("session factory closed");
	}
}
