package com.ent.oneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ent.utilities.Utility;

public class Hibernate_Test {

	public static void main(String[] args) {

//		SessionFactory factory = new Configuration()
//		.configure("com\\ent\\oneToManyMapping\\hibernate.cfg.xml")
//		.buildSessionFactory();

		Class[] annotatedClasses = { Vehicle.class, User.class };
		SessionFactory factory = Utility.getSessionFactoryForClasses(annotatedClasses);

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Verna");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Tiago");

		User user = new User();
		user.setUserName("First User");
		user.getVehicles().add(vehicle1);
		user.getVehicles().add(vehicle2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// session.persist(vehicle);
		session.save(user);

		tx.commit();
		session.close();

		factory.close();
		System.out.println("session factory closed");
	}
}
