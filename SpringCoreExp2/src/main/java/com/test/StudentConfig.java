package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	public static Student getStd1() {
		return new Student();
	}
	
//	@Bean
//	public static Student getStd2() {
//		return new Student(1, "Kohli", List);
//	}
	
	@Bean
	public static Order getOrderObj() {
		return new Order(501, "Banana", 560);
	}
	
	
}
