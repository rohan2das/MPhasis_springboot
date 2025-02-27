package com.test;

public class MethodOLnR {
	//method overloading: method name is same, signature is different
//	1. type of args
//	2. no of args
//	3. order of args
	public void add(int x, int y) {
		System.out.println("no of args");
	}
	public void add(long x, float y) {
		System.out.println("type of args");
	}
	public void add(float x, long y) {
		System.out.println("order of args");
	}
	public static void main(String[] args) {
		MethodOLnR obj = new MethodOLnR();
		obj.add(10,20);
		obj.add(33l,4.5f);
		obj.add(334.6f,45l);
	}
}
