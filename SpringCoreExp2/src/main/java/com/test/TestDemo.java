package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		
		/*
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student obj = ctx.getBean("std", Student.class);
		System.out.println(obj);
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student obj = ctx.getBean("getStd1", Student.class);
		
		obj.setId(111);
		obj.setName("Rahul");
		
		List<String> skills = Arrays.asList("python", ".net","cpp");		
		obj.setSkills(skills);
		
		System.out.println(obj);
		*/
		
		
//		Order obj = new Order(101, "Apple", 110);
//		System.out.println(obj.id()+" "+obj.name()+ " "+ obj.price());
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
		Order obj=ctx.getBean("getOrderObj", Order.class);
		System.out.println(obj);
		
		
	}
}
