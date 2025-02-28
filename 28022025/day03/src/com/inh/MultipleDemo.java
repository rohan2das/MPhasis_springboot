package com.inh;

interface Inf1{
	void fox();
	void tiger();
}

interface Inf2 {
	void book();
}

abstract class Ab{
	public void dog() {
		System.out.println("abs implemented method");
	}
	public abstract void cat();
}

class Impl extends Ab implements Inf1, Inf2{
	@Override
	public void cat() {
		System.out.println("cat method from abs class is implemented");
	}
	@Override
	public void fox() {
		System.out.println("fox() method from Inf1 is implemented");
	}
	@Override
	public void tiger() {
		System.out.println("tiger() method from Inf1 is implemented");
	}
	public void book() {
		System.out.println("book() method from Inf2 is implemented in Impl class");
	}
	
}

public class MultipleDemo {
	public static void main(String[] args) {
		Impl obj = new Impl();
		obj.cat();
		obj.dog();
		obj.fox();
		obj.tiger();
		obj.book();
	}
}
