package com.newjava4world;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./com/newjava4world/appContext.xml");
		
		//Employee e1 = new Employee("Manish","AMTS",10000);
		Employee e1 = (Employee)context.getBean("emp1");
		
		//Configuration cfg = new Configuration("./");
		//SessionFactory sf = cfg.buildSessionFactory();
		
		System.out.println(e1.getName());
		
	}

}
