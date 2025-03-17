package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.UserClass;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class HelloWorldActutor {

	UserClass obj = new UserClass();
	
	@Value("${name.fname}")
	String fname;
	
	@Value("${email.email}")
	String email;
	
	@Value("${desg.role}")
	String desgrole;
	
	@Operation(summary = "get method prints simple actuator", description = "this is very basic example of actuator")
	@GetMapping("/test")
	public String testActuator() {
		obj.setFname(fname);
		obj.setEmail(email);
		obj.setDesgrole(desgrole);
		return "Simple Actuator Response"+obj;
	}
}
