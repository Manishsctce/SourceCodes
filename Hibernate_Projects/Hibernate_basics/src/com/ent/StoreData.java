package com.ent;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = null;
		try {

			cfg.configure("com\\ent\\hibernate.cfg.xml");

			sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();

			session.save(new Employee("Arun", 380000));
			session.save(new Employee("Varun", 480000));

			tx.commit();
			session.close();
			System.out.println("record successfully persisted");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
