package com.test;

class Book{
	protected void finalize() throws Throwable {	//garbage collector will call this method
		System.out.println("object going to garbage collection");
	}
	public static Book getInstance(){
		return new Book();
	}
	public void display() {
		System.out.println("Test Finalize Method");
	}
}

public class ObjectNGc {
	public static void main(String[] args) {
		Book b1 = Book.getInstance();
		b1.display();
		b1 =null;
		System.out.println("after object null reference");
		System.gc();
		System.out.println("after gc exec");
	}
}
