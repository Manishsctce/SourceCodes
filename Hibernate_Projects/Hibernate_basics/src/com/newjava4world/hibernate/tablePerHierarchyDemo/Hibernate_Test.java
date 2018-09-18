package com.newjava4world.hibernate.tablePerHierarchyDemo;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate_Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
        		.configure("com\\newjava4world\\hibernate\\tablePerHierarchyDemo\\hibernate.cfg.xml")
        		.buildSessionFactory();
         
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Person person = new Person("Steve", "Balmer");
		session.save(person);

		Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
		session.save(employee);
        
		Query query = session.createQuery("from Person");
		List list = query.list();
		
		for(Object o : list){
			Person e = (Person)o;
			System.out.println(e.getPersonId()+":" +e.getFirstname() +" "+e.getLastname()+" ");
		}
        tx.commit();
        session.close();
        
      
        factory.close();
        System.out.println("session factory closed");
	}
}
