package com.ent.manyToManyMapping.unidirectional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ent.utilities.Utility;

public class Hibernate_Test {

	public static void main(String[] args) {
		
//		SessionFactory factory = new Configuration()
//        		.configure("com\\newjava4world\\hibernate\\unidirect_manyToManyMappingDemo\\hibernate.cfg.xml")
//        		.buildSessionFactory();
        Class annotatedClasses[] = {Author.class, Book.class};
		SessionFactory factory = Utility.getSessionFactoryForClasses(annotatedClasses);
		
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        List<Book> bookList = getBookList();
        
        for(Book book : bookList) {
        	session.save(book);
        }
        tx.commit();
        session.close();
        
        factory.close();
        System.out.println("session factory closed");
	}
	
	public static List<Book> getBookList(){
		List<Book> bookList = new ArrayList<>();
		
        Author author1 = new Author("Trevor Page");		
		Author author2 = new Author("John Doe");
		Author author3 = new Author("Javin King"); 
		Author author4 = new Author("Christian Bauer");
		Author author5 = new Author("Brian Douglas Murphy");
		Author author6 = new Author("Paul Fisher");
		
		//BOOK1 and its Authors
        Set<Author> howToProgramWithJavaAuthor = new HashSet<Author>(); 
        howToProgramWithJavaAuthor.add(author1);
        
        Book book1 = new Book("How to Program with Java");
		book1.setAuthors(howToProgramWithJavaAuthor);
		
		
		//BOOK2 and its Authors
		Set<Author> howToProgramWithJava2ndAuthors = new HashSet<Author>();
		howToProgramWithJava2ndAuthors.add(author1);
		howToProgramWithJava2ndAuthors.add(author2);
		
		Book book2 = new Book("How to Program with Java 2nd Edition");
		book2.setAuthors(howToProgramWithJava2ndAuthors);
		
		//BOOK3 and its Authors
		Set<Author> howToPlayGuitarAuthor = new HashSet<Author>();
		howToPlayGuitarAuthor.add(author2);

		Book book3 = new Book("How to Play Guitar");
		book3.setAuthors(howToPlayGuitarAuthor);
		
		//BOOK4 and its Authors
		Set<Author> javaPersistenceWithHibernateAuthors = new HashSet<Author>(); 
		javaPersistenceWithHibernateAuthors.add(author3);javaPersistenceWithHibernateAuthors.add(author4);
		
		Book javaPersistenceWithHibernateBook = new Book("Java Persistence with Hibernate");//author3,author4
		javaPersistenceWithHibernateBook.setAuthors(javaPersistenceWithHibernateAuthors);
		
		//BOOK5 and its Authors
		Set<Author> hibernateInActionAuthors = new HashSet<Author>();
		hibernateInActionAuthors.add(author3);hibernateInActionAuthors.add(author4);
		
		Book hibernateInActionBook = new Book("Hibernate in Action");//auth3,auth4
		hibernateInActionBook.setAuthors(hibernateInActionAuthors);
		
		//BOOK6 and its Authors
		Set<Author> springPersistenceWithHibernateAuthors = new HashSet<Author>();
		springPersistenceWithHibernateAuthors.add(author5);springPersistenceWithHibernateAuthors.add(author6);
		
		Book springPersistenceWithHibernateBook = new Book("Spring Persistence with Hibernate");//auth5,auth6
		springPersistenceWithHibernateBook.setAuthors(springPersistenceWithHibernateAuthors);
		
		bookList.add(book1);bookList.add(book2);bookList.add(book3);
		bookList.add(javaPersistenceWithHibernateBook);
		bookList.add(hibernateInActionBook);
		bookList.add(springPersistenceWithHibernateBook);
		return bookList;
	}
}
