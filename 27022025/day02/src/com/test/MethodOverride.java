package com.test;

class Exp1{
	void draw() {
		System.out.println("Circle");
	}
}

class Exp2 extends Exp1 {
	@Override
	void draw() {
		System.out.println("Square");
	}
}

public class MethodOverride {
	//method heading is same but body is different
	public static void main(String[] args) {
		Exp2 obj2 = new Exp2();
		obj2.draw();		
	}
}
