package com.test;

public class Address {
	private String state;
	private String country;
	private int pin;
	
	public Address() {
		
	}
	public Address(String state, String country, int pin) {
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
