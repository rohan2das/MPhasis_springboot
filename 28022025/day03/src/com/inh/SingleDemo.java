package com.inh;

class A{
	int id = 101;
	String name ="Rohit";
	public void useDetails() {
		System.out.println("ID: "+id+" Name: "+name);
	}
}

class B extends A{
	String city ="Chennai";
	public void stdInfo() {
		System.out.println("ID: "+id+" Name: "+name+" City: "+city);
	}
}
public class SingleDemo {
	public static void main(String[] args) {
		B objB = new B();
		objB.stdInfo();
		objB.useDetails();
		A objA = new A();
		objA.useDetails();
//		objA.stdInfo();
	}
}
