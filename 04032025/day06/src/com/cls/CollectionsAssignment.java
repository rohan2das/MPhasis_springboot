/* Find out the highest orders in a year
 * find out category(lifestyle, sport) wise orders count
 * print max price
 * monthly average spending in the e-com
 * find out minimum order price in total orders
 * find out first and last product from your purchase history
 * order id, order name, order category, quantity, order price, order month, order year, order city
 */

package com.cls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Orders{
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
	
}

public class CollectionsAssignment {
	
	public static void getHighestOrder(List<Orders> orderList) {
		System.out.println("Maximum order in a year");
		
		Map<Integer, Optional<Orders>> res = orderList.stream()
				.collect(Collectors.groupingBy(Orders :: getYear, 
						Collectors.maxBy(Comparator.comparingInt(Orders :: getQuantity))));
		res.forEach((k,v)-> System.out.println(k+" : "+v.get().getQuantity()));
	}
	
	public static void getCategoryWiseOrders(List<Orders> listOrders) {
		System.out.println("Category wise order details");
		Map<String,List<Orders>> res = listOrders.stream().collect(Collectors.groupingBy(Orders::getCategory));
		for(String s : res.keySet()) {
			System.out.println("\nCategory: "+ s);
			List<Orders> ord = res.get(s);
			ord.forEach(o->System.out.println(o));
		}
	}
	
	public static void getMaxPrice(List<Orders> orderList) {
		Optional<Orders> order = orderList.stream()
				.sorted(Comparator.comparing(Orders :: getPrice).reversed()).findFirst();
		System.out.println("Most Expencive order: "+ order.get());
	}
	
	public static void getAverageSpending(List<Orders> orderList) {
		Map<String, Double> monthlySpending = orderList.stream()
	            .collect(Collectors.groupingBy(
	                order -> order.getMonth() + " " + order.getYear(),
	                Collectors.summingDouble(Orders::getPrice)
	            ));
			System.out.println(monthlySpending);
//	        double averageMonthlySpending = monthlySpending.values().stream()
//	            .mapToDouble(Double::doubleValue)
//	            .average()
//	            .orElse(0.0);
//
//	        System.out.println("Average Monthly Spending: " + averageMonthlySpending);
	}
	public static void main(String[] args) {
		List<Orders> orderList = new ArrayList<>();
		orderList.add(new Orders(101, "iPhone", "Gadgets", 50, 19.99, "March", 2025, "Mumbai"));
		orderList.add(new Orders(102, "Samsung TV", "Electronics", 30, 29.99, "April", 2024, "Delhi"));
		orderList.add(new Orders(103, "Leather Wallet", "Accessories", 20, 9.99, "June", 2024, "Bangalore"));
		orderList.add(new Orders(104, "Hammer", "Tools", 15, 49.99, "November", 2024, "Chennai"));
		orderList.add(new Orders(105, "Fitbit", "Gadgets", 25, 39.99, "January", 2023, "Hyderabad"));
		orderList.add(new Orders(106, "Laptop", "Electronics", 40, 59.99, "March", 2020, "Pune"));
		orderList.add(new Orders(107, "Sunglasses", "Accessories", 35, 14.99, "December", 2021, "Kolkata"));
		orderList.add(new Orders(109, "iPad", "Gadgets", 45, 34.99, "December", 2021, "Surat"));
		orderList.add(new Orders(111, "Watch", "Accessories", 55, 12.99, "January", 2020, "Lucknow"));
		orderList.add(new Orders(113, "MacBook", "Gadgets", 33, 17.99, "March", 2021, "Indore"));
		orderList.add(new Orders(112, "Screwdriver", "Tools", 22, 27.99, "February", 2019, "Patna"));
		orderList.add(new Orders(115, "Smartwatch", "Gadgets", 48, 49.99, "May", 2020, "Nagpur"));
		orderList.add(new Orders(114, "Headphones", "Electronics", 18, 22.99, "April", 2023, "Bhopal"));
		orderList.add(new Orders(110, "Smartphone", "Electronics", 60, 44.99, "March", 2020, "Jaipur"));;
		
//		CollectionsAssignment.getHighestOrder(orderList);
//		CollectionsAssignment.getCategoryWiseOrders(orderList);
//		CollectionsAssignment.getMaxPrice(orderList);
		CollectionsAssignment.getAverageSpending(orderList);
		
	}
}
