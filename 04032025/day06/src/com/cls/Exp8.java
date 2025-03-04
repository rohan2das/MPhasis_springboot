/*GIVEN THE EMPLOYEE DETAILS
 *1. Find out count of male, female employees present in the company(convert list to map)
 *2. Write a program to print the name of all the departments in the company
 *3. Find the average age of male and female
 *4. Get the name of employees who joined after 2015
 *5. count number of employees from each department
 *6. Find out the average salary of each department
 *7. Find out the oldest employee, his/her age and department
 *8. Find out average and total salary of the company
 *9. List down employees from each department
 *10. Find out the highest experience in the company
 * */


package com.cls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOFfJoinig;
	double salary;
	public Employee() {
		
	}
	public Employee(int id, String name, int age, String gender, String department, int yearOFfJoinig, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOFfJoinig = yearOFfJoinig;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOFfJoinig() {
		return yearOFfJoinig;
	}
	public void setYearOFfJoinig(int yearOFfJoinig) {
		this.yearOFfJoinig = yearOFfJoinig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOFfJoinig=" + yearOFfJoinig + ", salary=" + salary + "]";
	}
	
	
}

public class Exp8 {
	
	//converting list to map
	public static void getCountOfMaleNFemale(List<Employee> empList) {
		Map<String, Long> result = empList.parallelStream().
				collect(Collectors.
						groupingBy(Employee :: getGender, Collectors.counting()));
		System.out.println(result);
	}
	
	//getting the names and printing
	public static void getDeptNames(List<Employee> empList) {
		empList.stream()
		.map(Employee :: getDepartment)
		.distinct()
		.forEach(dept-> System.out.println(dept));
	}
	
	//
	public static void getAvgGenderAge(List<Employee> empList) {
		Map<String, Double> avgData = empList.stream()
				.collect(Collectors.groupingBy(Employee :: getGender,
						Collectors.averagingInt(Employee :: getAge)));
		System.out.println(avgData);
	}
	
	public static void getNamesJoinedAfter2015(List<Employee> empList) {
		empList.stream().filter(emp -> emp.getYearOFfJoinig() > 2015)
		.map(Employee :: getName)
		.forEach(System.out :: println);
	}
	
	public static void getCountOfEmployeesFromEachDept(List<Employee> empList) {
		empList.stream()
		.collect(Collectors.groupingBy(
		Employee :: getDepartment, Collectors.counting()))
		.forEach((k,v)->System.out.println(k+" : "+v));
		
	}
	
	public static void getAvgSalByDept(List<Employee> empList) {
		Map<String, Double> res = empList.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment, 
						Collectors.averagingDouble(Employee :: getSalary)));
		res.forEach((k,v)->System.out.println(k+" : "+v));
	}
	
	public static void getOldestEmployee(List<Employee> empList) {
		Optional<Employee> oldEmp = empList.stream()
									.max(Comparator.comparing(Employee :: getAge));
		Employee empData = oldEmp.get();
		System.out.println("Name: "+empData.getName());
		System.out.println("Age: "+empData.getAge());
		System.out.println("Department: "+empData.getDepartment());
	}
	
	public static void getOverallAvgNTotal(List<Employee> empList) {
		DoubleSummaryStatistics salStats = empList.stream()
				.collect(Collectors.summarizingDouble(Employee :: getSalary));
		System.out.println("Average salary of the company: " + salStats.getAverage());
		System.out.println("Total salary of the company: " + salStats.getSum());
	}
	
	public static void getListOfEmployeeFromEachDept(List<Employee> empList) {
		Map<String, List<Employee>> res = 
				empList.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
//		System.out.println(res);
		for(String k : res.keySet()) {
			System.out.println("Department: "+ k);
			List<Employee> emp = res.get(k);
			for(Employee e:emp) {
				System.out.println(e.getName());
			}
		}
	}

	public static void getMostSenior(List<Employee> empList) {
		Optional<Employee> seniorEmp = empList.stream()
				.sorted(Comparator.comparing(Employee :: getYearOFfJoinig)).findFirst();
		Employee senEmp = seniorEmp.get();
		System.out.println("Senior Most Employee: "+senEmp.getName());
	}
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.00));
		empList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales and Marketing", 2015, 13500.00));
		empList.add(new Employee(133, "Martin Theron", 29, "Male", "Insfrastructure", 2012, 18000.00));
		empList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.00));
		empList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.00));
		empList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security and Transport", 2016, 10500.00));
		empList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account and Finance", 2010, 27000.00));
		empList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.00));
		empList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales and Marketing", 2016, 11500.00));
		empList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security and Transport", 2015, 11000.50));
		empList.add(new Employee(211, "Jasna Kaur", 37, "Female", "Insfrastructure", 2014, 15700.00));
		empList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 27000.00));
		
//		Exp8.getCountOfMaleNFemale(empList);
//		Exp8.getDeptNames(empList);
//		Exp8.getAvgGenderAge(empList);
//		Exp8.getNamesJoinedAfter2015(empList);
//		Exp8.getCountOfEmployeesFromEachDept(empList);
//		Exp8.getAvgSalByDept(empList);
//		Exp8.getOldestEmployee(empList);
//		Exp8.getOverallAvgNTotal(empList);
//		Exp8.getListOfEmployeeFromEachDept(empList);
		Exp8.getMostSenior(empList);
	}
}
