//Application context

package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);
		Address obj = ctx.getBean("getAdr2", Address.class);
		
		System.out.println(obj);
	}
}
