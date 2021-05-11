package com.ent.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Utility {
	public static SessionFactory sessionFactory;
	public static Configuration cf;
	
	public static Configuration getHBConfiguration() {
		if(cf == null) {
			cf = new Configuration();
			cf.setProperties(getMySqlDbProperties());		
		}
		return cf;
	}
	
	public static SessionFactory getSessionFactoryForClasses(Class[] annotatedClasses) {
		getHBConfiguration();
		
		for(Class c : annotatedClasses)
			cf.addAnnotatedClass(c);
		
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();
		
		sessionFactory = cf.buildSessionFactory(sr);
		return sessionFactory;
	}
	
	public static Properties getMySqlDbProperties() {
		Properties mySqlDbProp = new Properties();
		mySqlDbProp.put(Environment.HBM2DDL_AUTO, "create");
		mySqlDbProp.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		mySqlDbProp.put(Environment.URL, "jdbc:mysql://localhost/test");
		mySqlDbProp.put(Environment.USER, "system");
		mySqlDbProp.put(Environment.PASS, "root");
		mySqlDbProp.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		mySqlDbProp.put(Environment.SHOW_SQL, "true");		
		
		return mySqlDbProp;
	}
}
