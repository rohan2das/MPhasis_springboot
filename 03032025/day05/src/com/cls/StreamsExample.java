/*
class Employee
id name age gender YOJ salary


1. iterate using stream API and print starts with a specific character
2. who joined after 2020 using stream API 
3. (2) and in sorted manner and store in new list
*/

package com.cls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employeee{
	private int id;
	private String name;
	private int age;
	private String gender;
	private int yoj;
	private int salary;
	
	public Employeee() {
		
	}
	public Employeee(int id, String name, int age, String gender, int yoj, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.yoj = yoj;
		this.salary = salary;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", yoj=" + yoj
				+ ", salary=" + salary + "]";
	}
}

public class StreamsExample {
	public static void main(String[] args) {
		List<Employeee> empList = new ArrayList<>();
		empList.add(new Employeee(3,"Rahul", 29,"Male", 2016, 350));
		empList.add(new Employeee(2,"Gill", 24,"Male", 2021, 400));
		empList.add(new Employeee(1,"Rohit", 38,"Male", 2008, 550));
		empList.add(new Employeee(5,"Kohli", 35,"Male", 2009, 600));
		empList.add(new Employeee(4,"Jhulan", 40,"Female", 2006, 300));
		empList.add(new Employeee(7,"Rana", 22,"Female", 2024, 250));
		empList.add(new Employeee(6,"Rinku", 27, "Male", 2022, 300));
		
		empList.forEach(emp-> System.out.println(emp.getId()+" | "+emp.getName()+" | "+emp.getAge()+" | "+emp.getGender()+" | "+emp.getYoj()));
		System.out.println("-----------------formatted data begins here------------------");
		
		//starts with a specific character
		System.out.println("name starts with R");
		empList.stream().filter(emp->emp.getName().startsWith("R")).
		forEach(emp->System.out.println(emp.getId()+" | "+emp.getName()+" | "+emp.getAge()+" | "+emp.getGender()+" | "+emp.getYoj()));
		
		//joined after 2020
		System.out.println("joined after 2020");
		empList.stream().filter(emp->emp.getYoj()>=2020).
		forEach(emp->System.out.println(emp.getId()+" | "+emp.getName()+" | "+emp.getAge()+" | "+emp.getGender()+" | "+emp.getYoj()));
		
		//joined after 2020 and in sorted manner and store in new list
		System.out.println("joined after 2020 and in a sorted manner");
		List<Employeee> formattedData =	empList.stream().
				filter(emp->emp.getYoj()>=2020).
				sorted(Comparator.comparing(Employeee :: getYoj)).
				collect(Collectors.toList());
				
				
		formattedData.forEach(emp->System.out.println(emp.getId()+" | "+emp.getName()+" | "+emp.getAge()+" | "+emp.getGender()+" | "+emp.getYoj()));
		
		
	}
}
