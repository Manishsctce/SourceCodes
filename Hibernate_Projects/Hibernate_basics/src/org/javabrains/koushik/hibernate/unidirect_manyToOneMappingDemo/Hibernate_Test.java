package org.javabrains.koushik.hibernate.unidirect_manyToOneMappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate_Test {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Verna");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Tiago");
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		//user.setVehicles(vehicle1);
		//user.setVehicles(vehicle2);
		
		vehicle1.setUser(user);
		vehicle2.setUser(user);
		SessionFactory factory = new Configuration()
        		.configure("org\\javabrains\\koushik\\hibernate\\unidirect_manyToOneMappingDemo\\hibernate.cfg.xml")
        		.buildSessionFactory();
         
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(vehicle1);
        session.persist(vehicle2);
        //session.save(user);
        
        tx.commit();
        session.close();
        
      
        factory.close();
        System.out.println("session factory closed");
	}
}
