package com.test;

public class StaticNInstanceDemo {
	int id = 123212;
	static int pin = 34545;
	public void dog() {
		System.out.println(id);
		System.out.println(StaticNInstanceDemo.pin);
	}
	
	public static void cat() {
		StaticNInstanceDemo obj = new StaticNInstanceDemo();
		System.out.println(pin);
		System.out.println(obj.id);
	}
	public static void main(String[] args) {
		cat();
		StaticNInstanceDemo obj1 = new StaticNInstanceDemo();
		obj1.dog();
	}
}
