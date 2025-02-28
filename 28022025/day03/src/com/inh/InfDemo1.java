package com.inh;

interface Inf5{
	void human();
	void animal();
}

interface Inf6{
	void dog();
	void cat();
}

interface Inf7{
	void book();
	void color();
}

interface Inf8 extends Inf5, Inf6, Inf7{
	void dance();
}

class Impl1 implements Inf8{		//Inf8 contains multiple interfaces, so all are need to be implemented
	@Override
	public void dance() {
		System.out.println("Inf8 method overriden");
	}

	@Override
	public void human() {
		System.out.println("Inf5 method overriden");
	}

	@Override
	public void animal() {
		System.out.println("Inf5 method overriden");
	}

	@Override
	public void dog() {
		System.out.println("Inf6 method overriden");
	}

	@Override
	public void cat() {
		System.out.println("Inf6 method overriden");
	}

	@Override
	public void book() {
		System.out.println("Inf7 method overriden");
	}

	@Override
	public void color() {
		System.out.println("Inf7 method overriden");
	}
}

public class InfDemo1 {
	public static void main(String[] args) {
		Impl1 obj = new Impl1();
		obj.animal();
		obj.book();
		obj.cat();
		obj.color();
		obj.dance();
		obj.dog();
		obj.human();
	}
}
