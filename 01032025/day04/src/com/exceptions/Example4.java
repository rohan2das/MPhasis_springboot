package com.exceptions;

class Dog{
	public Dog() {
		System.out.println("dog default");
	}
	public Dog(String msg) {
		System.out.println("String arg constructor"+msg);
	}
}

class Fox extends Dog{
	public Fox() {
		super(" hello from fox");
		System.out.println("fox default constr");
	}
}

public class Example4 {
	public static void main(String[] args) {
		
		Fox obj = new Fox();
	}
}
