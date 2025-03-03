package com.thrds;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableImpl implements Callable<String>{
	public String call() throws Exception{
		return "hello world from callableImpl.call()";
	}
}

public class CallableExp1 {
	static ExecutorService executor = Executors.newFixedThreadPool(2);
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CallableImpl call =new CallableImpl();
		
		//starting the call() method of callable interface object and storing that in Future object
		Future<String> future = executor.submit(call);
		System.out.println(future.get().toString());
		executor.shutdown();
		System.out.println(executor.isShutdown());
		System.out.println(executor.isTerminated());
	}
}
