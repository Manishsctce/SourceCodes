package com.newjava4world.hibernate.projectionDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.AggregateProjection;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("com\\newjava4world\\hibernate\\projectionDemo\\hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tnx = session.beginTransaction();

		Product p1 = new Product();
		p1.setProName("Laptop"); p1.setPrice(40000.00);

		Product p2 = new Product();
		p2.setProName("Desktop"); p2.setPrice(30000.00);

		Product p3 = new Product();
		p3.setProName("Keyboard"); p3.setPrice(500.00);

		Product p4 = new Product();
		p4.setProName("Keyboard"); p4.setPrice(510.00);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		
		tnx.commit();
		System.out.println("Txn committed successfully");

		Criteria productCriteria = session.createCriteria(Product.class);
		
		//Projection by name
		Projection productByNameProjection = Projections.property("proName");
		Projection distinctProductByNameProjection = Projections.distinct(productByNameProjection);
		
		productCriteria.setProjection(distinctProductByNameProjection);
		List l=productCriteria.list();
		Iterator it=l.iterator();
		System.out.println("List of Product Name using Projection:");
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}		
		System.out.println("--------------------------------");
		
		//Projection by price
		productCriteria.setProjection(Projections.property("price"));		
		List priceList=productCriteria.list();
		Iterator priceListIter= priceList.iterator();
		System.out.println("List of Product Price using Projection:");
		while(priceListIter.hasNext())
		{
			Double s=(Double)priceListIter.next();
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		
		//Projection for max 
		AggregateProjection aggrProj = Projections.max("price");
		productCriteria.setProjection(aggrProj);
		List maxPriceList=productCriteria.list();
		Iterator maxPriceListIter= maxPriceList.iterator();

		while(maxPriceListIter.hasNext())
		{
			Double s=(Double)maxPriceListIter.next();
			System.out.println("Max Price : "+s);
		}
		
		session.close();
		factory.close();
	}

}
