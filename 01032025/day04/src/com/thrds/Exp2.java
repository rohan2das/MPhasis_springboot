package com.thrds;

class Add{
	public void add() {
		System.out.println("add()");
	}
}
class Sub{
	public void sub() {
		System.out.println("sub()");
	}
}


public class Exp2 implements Runnable{
	public void run() {
		try {
			System.out.println("run()");
			Add addObj = new Add();
			addObj.add();
			Sub subObj = new Sub();
			subObj.sub();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Exp2 t1 = new Exp2();
		
		ThreadGroup tg1 = new ThreadGroup("bank");
		
		//convert runnable interface object to Thread class
		Thread t2 = new Thread(tg1, t1, "Transfer");
		Thread t3 = new Thread(tg1, t1, "Credit");
		
		ThreadGroup tg2 = new ThreadGroup("Math");
		
		Thread t4 = new Thread(tg2, t1, "Add");
		Thread t5 = new Thread(tg2, t1, "Div");
		t2.start();
		t5.start();
		
		System.out.println("TG1 group running "+tg1.activeCount());
		System.out.println("TG2 group running "+tg2.activeCount());
		
	}
}
