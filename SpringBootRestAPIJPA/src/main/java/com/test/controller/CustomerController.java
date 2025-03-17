package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	public void setService(CustomerService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cst) {
		Customer cust = service.createCustomer(cst);
		return new ResponseEntity<Customer>(cust, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/listall")
	public ResponseEntity<List<Customer>> listAllCustomers(){
		
		List<Customer> cstList = service.readAllCustomers();
		return new ResponseEntity<List<Customer>>(cstList, HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer  cst, @PathVariable("id") int id){
		cst.setId(id);
		List<Customer> cstList = service.updateCustomer(cst);
		return new ResponseEntity<List<Customer>>(cstList, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable("id") int id){
		List<Customer> cstList =  service.deleteCustomer(id);
		return new ResponseEntity<List<Customer>>(cstList, HttpStatus.NO_CONTENT);
	}
	
}
