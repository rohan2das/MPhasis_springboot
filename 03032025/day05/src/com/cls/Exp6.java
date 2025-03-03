package com.cls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {
		
	}
	public Student(int id, String name, int age) {
		this.id =id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		return this.id-o.id;
//	}
}

public class Exp6 {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList();
		stdList.add(new Student(3, "Kohli", 35));
		stdList.add(new Student(2, "Rohit", 37));
		stdList.add(new Student(1, "Gill", 24));
		stdList.add(new Student(4, "Rahul", 29));
		stdList.add(new Student(5, "Rinku", 21));
		
		System.out.println("Before Sorting student data");
		stdList.forEach(std->System.out.println("ID: "+std.getId()+", Name="+std.getName()+", Age="+ std.getAge()));
		
		//Stream API
		List<Student> formattedData = stdList.parallelStream().
				sorted(Comparator.comparing(Student::getAge)).
				collect(Collectors.toList());
		
		System.out.println("After Sorting student data");
		formattedData.forEach(std->System.out.println("ID: "+std.getId()+", Name="+std.getName()+", Age="+ std.getAge()));
		
		
	}

}
