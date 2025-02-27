package com.test;

import java.util.Scanner;

class Order{
	private int id;
	private String name;
	private int price;
	private int qnty;
	public void setId(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setQnty(int qnty) {
		this.qnty =qnty;
	}
	public int getQnty() {
		return qnty;
	}
}

public class OrderDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order obj = new Order();
		System.out.print("Enter your id: ");
		int id = sc.nextInt();
		obj.setId(id);
		System.out.print("Enter your name: ");
		String name = sc.next();
		obj.setName(name);
		System.out.print("enter price: ");
		int price = sc.nextInt();
		obj.setPrice(price);
		System.out.print("enter Quantity: ");
		int qnty = sc.nextInt();
		obj.setQnty(qnty);
		System.out.println();
		System.out.println("ID: "+obj.getID()+" Name: "+obj.getName()+" Price: "+obj.getPrice()+" Quantity: "+obj.getQnty());
		sc.close();
	}
}
