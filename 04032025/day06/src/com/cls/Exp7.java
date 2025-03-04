package com.cls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Book1{
	private int id;
	private String name;
	private String author;
	public Book1() {
		
	}
	public Book1(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}

public class Exp7 {
	public static void main(String[] args) {
		Map<String, List<Book1>> bookData = new HashMap<>();
		//list of books
		List<Book1> bkData = new ArrayList<>();
		bkData.add(new Book1(101,"Core Java", "James"));
		bkData.add(new Book1(102,"python", "Arthur"));
		
		List<Book1> bkData2 = new ArrayList<>();
		bkData2.add(new Book1(201, "Spring", "RodJ"));
		bkData2.add(new Book1(202, "Microservices", "Anon"));
		
		List<Book1> bkData3 = new ArrayList<>();
		bkData3.add(new Book1(301, "ECE", "King"));
		bkData3.add(new Book1(302, "DE", "Rohit"));
		
		
		bookData.put("Software", bkData);
		bookData.put("Frameworks", bkData2);
		bookData.put("ECEDept", bkData3);
		
		Iterator<Entry<String, List<Book1>>> itr = bookData.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, List<Book1>> bk = itr.next();
			System.out.println("Department: "+bk.getKey());
			for(Book1 bd: bk.getValue()) {
				System.out.println(bd.getId()+" : "+bd.getName()+" | "+ bd.getAuthor());
			}
		}
		
		bookData.forEach((k, v)->System.out.println(k+" "+ v));
	}
}
