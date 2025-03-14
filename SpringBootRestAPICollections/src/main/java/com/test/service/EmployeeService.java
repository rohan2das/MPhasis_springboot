package com.test.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;
import com.test.model.Employees;


@Repository
@Service
public class EmployeeService implements EmployeeDao{
	private static Employees empData = new Employees();
	
	static {
		empData.getEmpList().add(new Employee(1, "Rohit", "ICC"));
		empData.getEmpList().add(new Employee(2, "Kohli", "BCCI"));
		empData.getEmpList().add(new Employee(3, "Saha", "BCCI"));
		empData.getEmpList().add(new Employee(4, "Gill", "IPL"));
		empData.getEmpList().add(new Employee(5, "SKY", "IPL"));
		empData.getEmpList().add(new Employee(6, "Pant", "BCCI"));
	}
	
	
	//create employee data
	@Override
	public Employee createEmployee(Employee emp) {
		empData.getEmpList().add(emp);
		return emp;
	}
	
	//read all employee data
	@Override
	public List<Employee> readAllEmployee(){
		return empData.getEmpList();
	}
	
	
	//update employee data
	@Override
	public String updateEmployee(Employee emp) {
		for(int i =0;i<empData.getEmpList().size();i++) {
			Employee e = empData.getEmpList().get(i);
			
			if(e.getId().equals(emp.getId())) {
				empData.getEmpList().set(i, emp);
			}
		}
		
		return "this id is not available";
	}
	
	
	//delete employee data
	@Override
	public String deleteEmployee(Integer id) {
		
		for(int i = 0; i<empData.getEmpList().size();i++) {
			Employee emp = empData.getEmpList().get(i);
			if(emp.getId().equals(id)) {
				empData.getEmpList().remove(i);
			}
		}
		
		return "this id is not available";
	}
	
}
