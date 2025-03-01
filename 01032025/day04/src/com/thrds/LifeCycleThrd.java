package com.thrds;

public class LifeCycleThrd extends Thread{
	@Override
	public void run() {		
		try {
			Thread.sleep(1000);
			System.out.println("inside run()");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		LifeCycleThrd t1 = new LifeCycleThrd();
		System.out.println(t1.getName());
		System.out.println("Before starting thread state: "+t1.getState());
		System.out.println("Before starting thread status: "+t1.isAlive());
		
		t1.start();
		System.out.println("After starting thread state: "+t1.getState()); //why executing before the previous line
		System.out.println("After starting thread status: "+t1.isAlive());
		Thread.sleep(100);
		System.out.println("in sleep thread state: "+ t1.getState());
		System.out.println("After sleep() thread status: "+t1.isAlive());
		
		t1.join();
		System.out.println("after joining thread state: "+t1.getState());
		System.out.println("after joining thread status: "+t1.isAlive());
		
	}
}
