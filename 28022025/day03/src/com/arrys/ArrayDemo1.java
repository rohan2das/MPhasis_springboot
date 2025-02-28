package com.arrys;

class Student{
	private int id;
	private String name;
	private String city;
	public Student() {
		
	}
	public Student(int id, String name, String city) {
		this.id =id;
		this.name =name;
		this.city=city;
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
		return "Student [id ="+id+" name= "+name+" city= "+city+"]";
	}
}


public class ArrayDemo1 {
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setId(101);
		obj1.setName("Rohan");
		obj1.setCity("Chennai");
		Student obj2 = new Student(201, "Nitya", "Kolkata");
		Student[] stdData = {obj1, obj2};
		for(int i=0; i<stdData.length;i++) {
			System.out.println(stdData[i].toString());
		}
		for(Student obj:stdData) {
			System.out.println(obj);
		}
	}
}
