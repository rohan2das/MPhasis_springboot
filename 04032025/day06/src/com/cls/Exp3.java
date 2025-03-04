package com.cls;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	private int id;
	private String name;
	private String author;
	private int price;
	
	public Book() {
		
	}
	public Book(int id, String name, String author, int price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}

//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return o1.getId()o2.getId();
//	}		

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
}

//comparing by name
class NameComparator1 implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}


public class Exp3 {
	public static void main(String[] args) {
		TreeSet<Book> data = new TreeSet<>();
		data.add(new Book(101, "Cricket", "Sachin", 123));
		data.add(new Book(102, "Java", "James", 115));
		data.add(new Book(103, "Spring", "RodJ", 23));
		data.add(new Book(201, "python", "anaconda", 50));
		data.add(new Book(155, "net", "Richord", 5));
		data.add(new Book(550, "net", "Richord", 129));
		data.add(new Book(450, "COBOL", "Kohli", 229));
		data.add(new Book(311, "perl", "sky", 180));
		System.out.println(data);
		
		data.forEach(book-> System.out.println(book.getId()+ " | "+ book.getName()+" | "+ book.getAuthor()+" | "+book.getPrice()));
		
		
		System.out.println("-------------------------------formatted output-------------------------------");
		data.parallelStream().filter(book->book.getPrice()>10 && book.getPrice()<=50 && book.getName().equals("python")).
		forEach(book-> System.out.println(book.getId()+ " | "+ book.getName()+" | "+ book.getAuthor()+" | "+book.getPrice()));
		
	}
}
