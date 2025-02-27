package com.test;

class Exp3{
	public void method1() {
		System.out.println("method-1");
		method2();
	}
	public void method2() {
		System.out.println("metod-2");
		method3();
	}
	public void method3() {
		System.out.println("method3");
		methodN();
	}
	public void methodN() {
		System.out.println("methodN");
	}
}

public class MethodChaining {
	public static void main(String[] args) {
		Exp3 obj = new Exp3();
		obj.method1();
	}
}
