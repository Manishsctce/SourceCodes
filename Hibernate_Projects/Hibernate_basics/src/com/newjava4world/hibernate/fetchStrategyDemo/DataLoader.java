package com.newjava4world.hibernate.fetchStrategyDemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class DataLoader {
 
    public static void main(String[] args) {
         
        SessionFactory factory = new Configuration()
        		.configure("com\\newjava4world\\hibernate\\fetchStrategyDemo\\hibernate.cfg.xml")
        		.buildSessionFactory();
         
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Person p = new Person();
        p.setId(1);
        p.setFirstName("Bill");
        p.setLastName("Banks");
         
        Address a1 = new Address();
        a1.setFirstLine("Line 11");
        a1.setSecondLine("Line 12");
        a1.setZipCode("12345");
        a1.setId(1);
        a1.setPerson(p);
        p.addAddress(a1);
         
        Address a2 = new Address();
        a2.setFirstLine("Line 21");
        a2.setSecondLine("Line 22");
        a2.setZipCode("54321");
        a2.setId(2);
        a2.setPerson(p);
        p.addAddress(a2);
 
        Address a3 = new Address();
        a3.setFirstLine("Line 31");
        a3.setSecondLine("Line 32");
        a3.setZipCode("11221");
        a3.setId(3);
        a3.setPerson(p);
        p.addAddress(a3);
 
        Address a4 = new Address();
        a4.setFirstLine("Line 41");
        a4.setSecondLine("Line 42");
        a4.setZipCode("22331");
        a4.setId(4);
        a4.setPerson(p);
        p.addAddress(a4);
 
        Person p1 = new Person();
        p1.setId(2);
        p1.setFirstName("Steve");
        p1.setLastName("Jobs");
         
        Address a11 = new Address();
        a11.setFirstLine("Line 111");
        a11.setSecondLine("Line 112");
        a11.setZipCode("12345");
        a11.setId(5);
        a11.setPerson(p1);
        p1.addAddress(a11);
         
        Address a22 = new Address();
        a22.setFirstLine("Line 221");
        a22.setSecondLine("Line 222");
        a22.setZipCode("54321");
        a22.setId(6);
        a22.setPerson(p1);
        p1.addAddress(a22);
 
        Address a33 = new Address();
        a33.setFirstLine("Line 331");
        a33.setSecondLine("Line 332");
        a33.setZipCode("11221");
        a33.setId(7);
        a33.setPerson(p1);
        p1.addAddress(a33);
 
        Address a44 = new Address();
        a44.setFirstLine("Line 441");
        a44.setSecondLine("Line 442");
        a44.setZipCode("22331");
        a44.setId(8);
        a44.setPerson(p1);
        p1.addAddress(a44);
 
        Person p2 = new Person();
        p2.setId(3);
        p2.setFirstName("Clark");
        p2.setLastName("Jacob");
         
        Address a111 = new Address();
        a111.setFirstLine("Line 111");
        a111.setSecondLine("Line 112");
        a111.setZipCode("12345");
        a111.setId(9);
        a111.setPerson(p2);
        p2.addAddress(a111);
         
        Address a222 = new Address();
        a222.setFirstLine("Line 221");
        a222.setSecondLine("Line 222");
        a222.setZipCode("54321");
        a222.setId(10);
        a222.setPerson(p2);
        p2.addAddress(a222);
     
        session.save(p);
        session.save(p1);
        session.save(p2);
         
        tx.commit();
        System.out.println("Successfully inserted all the datas");
        
        //selectFetch(session);
        
        joinFetch(session);
        if(session!=null)
        	session.close();
        
        if(factory!=null)
        	factory.close();
    }
 
    public static void selectFetch(Session session){
    	Query q = session.createQuery(" FROM Person p ");
        
        System.out.println("Retrieving Data");
        List l = q.list();
        System.out.println("Data retrieved: " + l.size());
        for (Object object : l) {
            Person pe = (Person) object;
            System.out.println(pe + " No of Addrs:"+ pe.getAddresses().size());
            /*System.out.println("Address retrieval initiated.");
            List<Address> addresses = pe.getAddresses();
            System.out.println("Address retrieval complete.");
            int i=1;
            for (Address address : addresses) {
                System.out.println("#### individual address: " + i);
                System.out.println(address);
                System.out.println("#### Address complete");
                i++;
            }*/
        }
    }
    
    public static void joinFetch(Session session){
    	  Query q = session.createQuery(" SELECT p, a FROM Person as p left outer join p.addresses a where p.id = a.personId");
          
          System.out.println("Retrieving Data using join fetch stategy");
          List l = q.list();
          System.out.println("Result size: " + l.size());
          System.out.println("Data retrieved");
          for (Object object : l) {
              if (object instanceof Object[]) {
                  Object[] objArr = (Object[]) object;
                  //System.out.println("Person");
                  Person p = (Person)objArr[0];
                  System.out.println(p + "Adrrs:"+p.getAddresses().size());
                  //System.out.println("Address");
                  //System.out.println(objArr[1]);
              } else {
                  throw new RuntimeException("Unable to process.");
              }
          }
    }
}