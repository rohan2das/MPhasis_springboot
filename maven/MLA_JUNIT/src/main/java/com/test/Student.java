package com.test;

public class Student {
	private int rollNumber;
	private String studentName;
	private Double percentage;
	
	
	public Student(int rollNumber, String studentName, Double percentage) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.percentage = percentage;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	
}
