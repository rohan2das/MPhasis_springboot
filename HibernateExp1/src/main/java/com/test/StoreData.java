package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		
		//1. create configuration class object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//2. create SessionFactory Object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//3.create session object
		Session session = sf.openSession();
		
		//4.transaction object
		Transaction t = session.beginTransaction();
		
		//transient state
		Book b = new Book();
		
		b.setB_name("Spring");
		b.setB_author("RodJ");
		b.setB_price(123);
		
		//5 execute the object
		session.save(b);	//persistent state
		
		t.commit();	//inserting
		
		System.out.println("Done");
		
		//6. close session object
		session.close();//detached state
		
		
		
	}
}
