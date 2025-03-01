package com.thrds;

public class Exp1 extends Thread{
	@Override
	public void run() {
		System.out.println("from run()");
	}
	
	public static void main(String[] args) {
		Exp1 t1 = new Exp1();
		Exp1 t2 = new Exp1();
		Exp1 t3 = new Exp1();
		
		System.out.println(t1.getName()+" "+t2.getName()+" "+t3.getName());
		t1.setName("Validate");
		t2.setName("Debit");
		t3.setName("Credit");
		System.out.println(t1.getName()+" "+t2.getName()+" "+t3.getName());
		
		System.out.println(t1.getPriority()+" "+t2.getPriority()+" "+t3.getPriority());
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		System.out.println(t1.getPriority()+" "+t2.getPriority()+" "+t3.getPriority());
		
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority()+" "+t2.getPriority()+" "+t3.getPriority());
		
		ThreadGroup tg = new ThreadGroup("Bank");
	}
}
