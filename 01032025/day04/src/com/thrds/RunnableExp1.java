package com.thrds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableImpl implements Runnable{
	public void run() {
		System.out.println("run() on Runnable class");
	}
}

class RunnableImpl1 implements Runnable{
	public void run() {
		System.out.println("run() on Runnable1 class");
	}
}

public class RunnableExp1 {
	static ExecutorService executor = Executors.newFixedThreadPool(2);
	public static void main(String[] args) {
		RunnableImpl task = new RunnableImpl();
		RunnableImpl1 task1 = new RunnableImpl1();
		Thread t1 = new Thread(task);
//		t1.start();
		
		executor.submit(task, task1);
		executor.shutdown();
	}
}
