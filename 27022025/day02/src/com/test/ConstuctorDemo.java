package com.test;

class Employee{
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int x, String str) {
		System.out.println("parameterized constructor");
	}
	public Employee(Employee obj) {
		System.out.println("object parameterised constructor");
	}
	
	//factory method to create object --> new instance for the class
	public static Employee getObj(Employee emp) {
		if(emp == null) {
			emp = new Employee();
		}
		System.out.println("object created");
		return emp;
	}
	public static Employee getInstance() {
		return new Employee();
	}
}

public class ConstuctorDemo {
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		System.out.println("obj1: "+ obj1.hashCode());
		Employee obj2 = new Employee(10, "RD");
		System.out.println("obj2: "+ obj2.hashCode());
//		Employee obj3 = new Employee(obj1);
		Employee obj4 = obj1.getObj(obj1);
		System.out.println("obj4: "+ obj4.hashCode());
		Employee obj9;
		obj9= Employee.getObj(obj4);
		System.out.println("obj9: "+ obj9.hashCode());
	}
}
