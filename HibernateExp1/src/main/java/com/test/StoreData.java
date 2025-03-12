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
		
		b.setB_name("PyThon");
		b.setB_author("nohTyP");
		b.setB_price(123);
		
		//5 execute the objec
		
		//inserting
//		session.save(b);	//persistent state
//		t.commit();	//inserting
		
		//read the data
//		Book bobj = session.get(Book.class, 2);
//		System.out.println(bobj.getId()+" "+bobj.getB_name()+" "+bobj.getB_author()+" "+bobj.getB_price());
		
//		delete
		Book bobj = session.get(Book.class, 3);
		Book bobj4 = session.get(Book.class, 4);
		session.delete(bobj);
		session.delete(bobj4);
		t.commit();
		
		
		//update
//		bobj.setB_name("Servlet");
//		session.save(bobj);
//		t.commit();
		
		System.out.println("Done");
		
		//6. close session object
		session.close();//detached state
		
		
		
	}
}
