package com.inh;

@FunctionalInterface		//only one abstract method and n-number of static and default method from jdk8
interface FunInf{
	void greetUser();		
	static void human() {
		System.out.println("static");
	}
	default void animal() {
		System.out.println("default");
	}
	private void fox() {
		System.out.println("Private");
	}
}

public class FuncInfDemo {
	public static void main(String[] args) {
		FunInf obj = new FunInf() {
			
			@Override
			public void greetUser() {
				// old style of implementing 
				System.out.println("FunInf.greetUser() overriden");
			}
		};
		obj.greetUser();
		
		new FunInf() {
			
			@Override
			public void greetUser() {
				// TODO Auto-generated method stub
				System.out.println("nameless object");
			}
		}.greetUser();
		
		//java8 feature: lambda function
		FunInf obj2 = ()-> System.out.println("java8 new feature");
		obj2.greetUser();
	}
}
