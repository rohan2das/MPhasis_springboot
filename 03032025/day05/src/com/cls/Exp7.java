package com.cls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//using comparable and comparator sorting the data based on id, name and age
//comparable from java.lang.*; package is a functional interface
//int compareTo(Object o)

class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private String city;
	
	public Customer() {
		
	}
	public Customer(int id, String name, String city) {
		this.id =id;
		this.name =name;
		this.city =city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	@Override
	public int compareTo(Customer o) {
		return this.id-o.id;			//asc order(class variable -local variable); desc order if vice-versa
	}
	
}


public class Exp7 {
	public static void main(String[] args) {
		List<Customer> custList = new ArrayList<>();
		custList.add(new Customer(5, "Rahul", "Pune"));
		custList.add(new Customer(3, "Kohli", "Bangalore"));
		custList.add(new Customer(1, "Rohit", "Mumbai"));
		custList.add(new Customer(2, "Dhoni", "Chennai"));
		custList.add(new Customer(4, "Pant", "Delhi"));
		
		Collections.sort(custList);
		custList.forEach(cust -> System.out.println(cust.getId()+" | "+cust.getName()+" | "+cust.getCity()));
		
		//using stream API print names with filter method starts with chars
		custList.stream().
		filter(cust->cust.getName().startsWith("R")).
		forEach(dt-> System.out.println(dt));;
		
		//using stream API sorting customer data
		custList.stream()
		.sorted(Comparator.comparing(Customer :: getName))
		.forEach(cust->System.out.println(cust.getId()+" "+cust.getName()+" "+ cust.getCity()));
	
		//create new list and store the formatted data
		List<Customer> formattedData = custList.stream()
				.sorted(Comparator.comparing(Customer :: getName))
				.collect(Collectors.toList());
		
		formattedData.forEach(cust->System.out.println(cust.getId()+" | "+cust.getName()+" | "+cust.getCity()));
	}
}
