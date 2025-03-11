package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee obj = ctx.getBean("getEmp2", Employee.class);
		System.out.println("Using Annotation");
		System.out.println(obj);
		
		System.out.println("\nusing beans");
		
		ApplicationContext ctxBeans = new ClassPathXmlApplicationContext("beans.xml");
		Employee objBeans = ctxBeans.getBean("getEmpBean3", Employee.class);
		System.out.println(objBeans);
	}
}
