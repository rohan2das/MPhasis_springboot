package com.inh;

interface FunInf5{
	String greetUser(int id, String name, String message);
}

public class FunDemo3 {
	public static void main(String[] args) {
		FunInf5 obj = (int id, String name, String message)->{
			System.out.println("hello from lambda");
			return (id+", "+name+", "+message);
		};
		
		System.out.println(obj.greetUser(311, "Rohan", "Hello"));
	}
}
