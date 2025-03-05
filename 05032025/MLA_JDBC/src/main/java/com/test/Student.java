package com.test;

public class Student {
	
	private int id;
	
	private String name;
	
	private String email;
	
	
	

	public Student(int id2, String name2, String email2) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.name = name2;
		this.email = email2;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
