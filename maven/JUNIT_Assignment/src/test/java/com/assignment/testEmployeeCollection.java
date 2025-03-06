package com.assignment;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;



public class testEmployeeCollection {
	
	@org.junit.jupiter.api.Test
	public void testCollectionObject() {
		List<Employee> listEmployee = Arrays.asList(
				new Employee(101, "Gill", 350, "Sales", "Amritsar"),
				new Employee(102, "Jaiswal", 300, "Marketting", "Surat"),
				new Employee(103, "Kohli", 750, "Management", "Delhi"),
				new Employee(105, "Rohit", 700, "Management", "Mumbai"),
				new Employee(107, "Shreyas", 550, "Development", "Hyderabad"),
				new Employee(106, "Axar", 550, "Development", "Punjab"),
				new Employee(108, "Rinku", 500, "Rinku", "UP"));
				
		
		//checking with assert equals
		assertEquals(new Employee(108, "Rinku", 500, "Rinku", "UP"), listEmployee.getLast());
		System.out.println("checked assertEquals");
		
		//check if an object is present
		assertThat(listEmployee, hasItem(new Employee(106, "Axar", 550, "Development", "Punjab")));
		System.out.println("checked hasItem()");
		
		
		//validate total object count
		assertThat(listEmployee.size(), is(7));
		System.out.println("checked object count using is()");	
	}
	
	//check if the name is null
	@org.junit.jupiter.api.Test
	public void testNameIsNull() {
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			Employee obj = new Employee();
			obj.setName(null);
		});
		
		assertEquals("username cannot be blank", exception.getMessage());
		System.out.println(exception.getMessage());
	}
	
	//check if name length is short
	@org.junit.jupiter.api.Test
	public void testNameShortLength() {
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			Employee obj = new Employee();
			obj.setName("ro");
		});
		assertEquals("name is too short", exception.getMessage());
		System.out.println(exception.getMessage());
	}
	
	//check if name length is long
	@org.junit.jupiter.api.Test
	public void testNameLongLength() {
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			Employee obj = new Employee();
			obj.setName("rosfhdhjsdksjhfjkdhjfhurefggdfhbjksdakjjbda");
		});
		assertEquals("name is too long", exception.getMessage());
		System.out.println(exception.getMessage());

	}
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testNameValues() {
		Employee obj = new Employee();
		obj.setName(null);
	}	
	
	
	
}
