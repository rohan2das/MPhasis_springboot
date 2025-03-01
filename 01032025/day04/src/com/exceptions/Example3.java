package com.exceptions;

class Cat{
	public Cat() {
		System.out.println("defaut");
	}
	public Cat(String msg) {
		this();
		System.out.println("from parameterised const");
	}
	public Cat(int id) {
		this("java");
		System.out.println("int arg constructor");
	}
}

public class Example3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cat obj = new Cat(100);
	}
}
