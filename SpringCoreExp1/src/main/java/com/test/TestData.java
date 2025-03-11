//XML configuration


package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
	public static void main(String[] args) {
		
		
		System.out.println("before bean.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
//		Employee obj = (Employee)ctx.getBean("emp");
		System.out.println("before getbean()");
		Employee obj = ctx.getBean("emp", Employee.class);
		System.out.println("after getbean()");
		
		System.out.println(obj);
		
//		Employee obj1 = (Employee)ctx.getBean("emp1");
//		System.out.println(obj1);
		
	}
}
