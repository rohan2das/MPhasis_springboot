package com.inh;

interface Inf9{
	void add();
	//interface inside interface
	interface Inf10{
		void mul();		
	}
}

class Impl7 implements Inf9.Inf10{		//access modifiers for interface
//	@Override
//	public void add() {
//		System.out.println("overriden add()");
//	}
	@Override
	public void mul() {
		System.out.println("overriden mul()");
	}
}

public class NestedInfDemo {
	public static void main(String[] args) {
		Impl7 obj = new Impl7();
		obj.mul();
	}
}
