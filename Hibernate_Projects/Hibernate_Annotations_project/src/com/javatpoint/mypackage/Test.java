 package com.javatpoint.mypackage;  

import java.util.List;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.javatpoint.Employee;  
  
public class Test {  
	public static void main(String[] args) {       
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = 
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

		SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
		create(sessionFactory);
		read(sessionFactory);
		
		sessionFactory.close();
		
	}  

	private static void read(SessionFactory sessionFactory) {
		
		Session session = sessionFactory.openSession();
	    Transaction t=session.beginTransaction();  
	    
	    List empList = session.createQuery("from Employee").list();
	    if(empList!=null && empList.size()>0){
	    	for(Object obj : empList){
	    		System.out.println(((Employee) obj).getId()+" FirstName: "+((Employee) obj).getFirstName());
		    }
	    }
	    t.commit();
	    session.close();
	}

	public static void create(SessionFactory sessionFactory){
		Session session = sessionFactory.openSession();
	    Transaction t=session.beginTransaction();  
	      
	    Employee e1=new Employee();  
	    e1.setId(1001);  
	    e1.setFirstName("sonoo");  
	    e1.setLastName("jaiswal");  
	      
	    Employee e2=new Employee();  
	    e2.setId(1002);  
	    e2.setFirstName("vimal");  
	    e2.setLastName("jaiswal");  
	      
	    session.persist(e1);  
	    session.persist(e2);  
	      
	    t.commit();  
	    session.close();  	    
	    System.out.println("successfully saved");  		
	}
}  