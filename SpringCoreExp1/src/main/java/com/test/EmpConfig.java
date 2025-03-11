package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	
	@Bean
	public static Address getAdr1() {
		return new Address();
	}
	
	@Bean
	public static Address getAdr2() {
		return new Address("TN", "India", 600125);
	}
	
	@Bean
	public static Employee getEmp1() {
		return new Employee();
	}
	
	@Bean
	public static Employee getEmp2() {
		return new Employee(111, "Rinku", "KKR", "kolkata", getAdr2());
	}
	
	
}
