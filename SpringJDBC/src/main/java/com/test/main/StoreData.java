package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.test.dao.CustDao;
import com.test.model.Customer;

public class StoreData {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		CustDao cst = ctx.getBean("custDao", CustDao.class);
		
//		Customer obj = new Customer();
//		obj.setName("Axar");
//		obj.setType("AllRounder");
//		
//		cst.createCustomer(obj);
//		System.out.println("done creating in db");

		
		
//		Customer objUpdate = new Customer();
//		objUpdate.setId(2);
//		objUpdate.setName("Rahul");
//		objUpdate.setType("visiting");
//		cst.updateCustomer(objUpdate);
//		System.out.println("done updating in db");
	
		
//		Customer objDelete = new Customer();
//		objDelete.setId(5);
//		cst.updateCustomer(objDelete);
//		System.out.println("done deleting in db");
		
		
		List<Customer> data = cst.getAllCustomers();
		System.out.println(data);
		data.forEach(cust->System.out.println(cust));
		
	}
}
