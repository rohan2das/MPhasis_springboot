package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean
	public static Employee getEmp1() {
		return new Employee();
	}
	
	@Bean
	public static Employee getEmp2() {
		List<String> technology = Arrays.asList("Java-Core", "Java-fsd", "Java-SpringBoot", "JDBC");
		return new Employee(101, "Adam", technology);
	}
}
