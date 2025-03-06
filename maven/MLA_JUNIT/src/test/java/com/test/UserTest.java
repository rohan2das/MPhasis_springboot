package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {
	User obj;
	static int id;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BEFORE ALL THE TEST CASES");
		id =1;
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AFTER ALL THE TEST CASES");
		id=0;
	}
	
	@Before
	public void setUp() {
		System.out.println("EVERY TIME BEFORE A TEST CASE");
		obj = new User();
	}
	@After
	public void setDown() {
		System.out.println("EVERY TIME AFTER A TEST CASE");
		obj = null;
	}
	
	@Test
	public void testGreetUser() {
		System.out.println("inside testGreetUser");
		String res = obj.greetUser("Rohan");
		assertEquals("Welcome Rohan", res);
	}
	@Test
	public void testNextId() {
		System.out.println("inside testNextId");
		int res = obj.returnNext(id);
		assertEquals(2, res);
	}
	
	
}
