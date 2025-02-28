package com.inh;

class Parent1{
	public void draw() {
		System.out.println("Square");
	}
}
class Child1 extends Parent1{
	@Override
	public void draw() {
		System.out.println("circle");
	}
}
class Child2 extends Parent1{
	@Override
	public void draw() {
		System.out.println("rectangle");
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj1 = new Child1();
		obj1.draw();
		Child2 obj2 = new Child2();
		obj2.draw();
		
		Parent1 obj3 = new Child1();
		obj3.draw();
		Parent1 obj4 = new Child2();
		obj4.draw();
	}

}
