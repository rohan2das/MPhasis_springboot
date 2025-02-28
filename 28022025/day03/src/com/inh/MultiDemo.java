package com.inh;

class C{
	public void method1() {
		System.out.println("Top most base classs");
	}
}

class D extends C{
	public void method2() {
		System.out.println("Intermediate base class");
	}
}

class E extends D{
	public void method3() {
		System.out.println("Bottom most derived class");
	}
}

public class MultiDemo {
	public static void main(String[] args) {
		E objE = new E();
		objE.method3();
		objE.method2();
		objE.method1();
		
		//object type casting
		C objC = objE;	//allowed
//		objE = objC;	//not allowed
		
		//Object class is the superclass of all
		Object obj = objE;
//		objC = (Object) objE;	//cannot typecast any object with Object Class
		
	}
}
