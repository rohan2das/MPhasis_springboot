package com.test;

class Customer{
	public Customer() {		//4
		System.out.println("constructor");
	}
	{
		System.out.println("instance block"); //3
	}
	static {
		System.out.println("static block");	//2
	}
}

public class BlocksDemo {
	public static void main(String[] args) {
		System.out.println("inside main()");	//1
		Customer obj = new Customer();
	}
}
