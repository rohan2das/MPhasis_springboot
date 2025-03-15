package com.test.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	
	@NotNull(message = "id required")
	private int id;
	
	@NotEmpty(message = "name required")
	@Size(min = 3, max = 25)
	private String name;
	
	@NotEmpty(message="email required")
	@Email(message = "check email format")
	private String email;
	
	@NotNull(message = "enter start date")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date startDate;
	
	@NotEmpty(message = "gender required")
	private String gender;
	
	
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", startDate=" + startDate + ", gender="
				+ gender + "]";
	}
	
}
