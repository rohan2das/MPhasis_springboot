package com.test;

public class Orders {
	private int id;
	private String name;
	private String category;
	private int quantity;
	private double price;
	private String month;
	private int year;
	private String city;
	
	public Orders() {
		
	}

	public Orders(int id, String name, String category, int quantity, double price, String month, int year,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.month = month;
		this.year = year;
		this.city = city;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", category=" + category + ", quantity=" + quantity + ", price="
				+ price + ", month=" + month + ", year=" + year + ", city=" + city + "]";
	}
	
	public double getTotalCost() {
		return price*quantity;
	}
}
