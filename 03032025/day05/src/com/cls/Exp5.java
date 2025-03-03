package com.cls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String salary;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee[id="+id+", name="+name+", salary="+salary+"]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.id -this.id;			//swapping the this and o will result in desc order
	}
}


class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());		//swapping the o2 and o1 will result in desc order
	}
	
}

public class Exp5 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(2, "John", "1234"));
		empList.add(new Employee(4, "July", "1324"));
		empList.add(new Employee(3, "Jane", "1243"));
		empList.add(new Employee(6, "Cate", "1423"));
		empList.add(new Employee(5, "Adam", "1342"));
		empList.add(new Employee(7, "Iris", "1432"));
		
		Iterator<Employee> itr = empList.iterator();
		
		System.out.println("Before sorting the list");
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			
			Employee emp = itr.next();
			System.out.println("Employee id="+emp.getId()+", name="+emp.getName());
		}

		
		Collections.sort(empList);
		System.out.println("After sorting the list");
		for(Employee emp:empList) {
			System.out.println("Employee id="+emp.getId()+", name="+emp.getName());			
		}
		
		Collections.sort(empList, new NameComparator());
		System.out.println("sorted based on names");
		for(Employee emp:empList) {
			System.out.println("Employee id="+emp.getId()+", name="+emp.getName());			
		}
		
	}
}
