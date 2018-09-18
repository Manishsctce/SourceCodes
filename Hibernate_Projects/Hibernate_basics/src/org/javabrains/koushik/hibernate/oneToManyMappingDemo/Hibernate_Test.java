package org.javabrains.koushik.hibernate.oneToManyMappingDemo;

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
		user.getVehicles().add(vehicle1);
		user.getVehicles().add(vehicle2);
		
		SessionFactory factory = new Configuration()
        		.configure("org\\javabrains\\koushik\\hibernate\\oneToManyMappingDemo\\hibernate.cfg.xml")
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
