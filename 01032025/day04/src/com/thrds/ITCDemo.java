package com.thrds;

class Item{
	boolean valSet =false;
	int val = 0;
	public synchronized void putItem(int x){
			try{
				if(valSet) {
					wait();				
				}
				val =x;
				System.out.println("Producer thread created an item: "+val);
				valSet=true;
				notify();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	public synchronized void getItem() {
		try {
			if(!valSet) {
				wait();
			}
			System.out.println("Consumer consumed one item: "+ val);
			valSet =false;
			notify();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable{
	int i;
	public Item item;
	public Producer(Item item) {
		this.item = item;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				item.putItem(++i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable{
	public Item item;
	public Consumer(Item item) {
		this.item = item;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(500);
				item.getItem();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class ITCDemo {
	public static void main(String[] args) {
		Item item = new Item();
		Producer pr = new Producer(item);
		Consumer cr = new Consumer(item);
		Thread t1=new Thread(pr);
		Thread t2 = new Thread(cr);
		t1.start();
		t2.start();
	}
}
