package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator obj;
	
	static int x;
	static int y;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all the test cases only one time");
		x=10;
		y =50;
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After all the test cases only one time");
		x=0;
		y=0;
	}
	
	@Before
	public void setUp() {
		System.out.println("executes every test method before execution");
		obj = new Calculator();
	}
	@After
	public void setDown() {
		System.out.println("executes every test method after execution");
		obj = null;
	}
	
	@Test
	public void testAdd() {
		System.out.println("testAdd method");
		int res=obj.add(x, y);
		assertEquals(60, res);
	}
	
	@Test
	public void testSub() {
		System.out.println("testSub method");
		int res = obj.sub(x, y);
		assertEquals(-40, res);
	}
	
	@Test
	public void testMul() {
		System.out.println("testMul method");
		int res = obj.mul(x, y);
		assertEquals(500, res);
	}
	
	@Test
	public void testGreetUser() {
		System.out.println("tetGreetUser method");
		assertEquals("hello world", obj.greetUser("hello world"));
	}
}
