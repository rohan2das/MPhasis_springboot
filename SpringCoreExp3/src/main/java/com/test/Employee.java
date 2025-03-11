package com.test;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<String> technology;
	
	public Employee() {
		
	}

	public Employee(int id, String name, List<String> technology) {
		this.id = id;
		this.name = name;
		this.technology = technology;
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

	public List<String> getTechnology() {
		return technology;
	}

	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}
	
}
