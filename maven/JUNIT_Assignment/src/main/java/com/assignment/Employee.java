package com.assignment;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String department;
	private String city;
	
	public Employee() {
		
	}
	public Employee(int id, String name, int salary, String department, String city) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id == 0) {
			throw new IllegalArgumentException("id cannot be null");
		}
		else{
			this.id = id;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException("username cannot be blank");
		}
		else {
			if(name.length()<3) {
				throw new IllegalArgumentException("name is too short");
			}
			else if(name.length()>30) {
				throw new IllegalArgumentException("name is too long");
			}
		}
		this.name =name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, department, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name) && salary == other.salary;
	}
	
	
	
}
