package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.repository.CustomerRepository;


@Repository
public class CustomerDAOImpl implements CustomerDao {

	@Autowired
	private CustomerRepository repository;
	
	
	@Override
	public Customer createCustomer(Customer cst) {
		return repository.save(cst);
	}

	@Override
	public List<Customer> readAllCustomers() {
		return repository.findAll();
	}

	@Override
	public List<Customer> updateCustomer(Customer cst) {
		
		repository.save(cst);
		
		return repository.findAll();
	}

	@Override
	public List<Customer> deleteCustomer(int id) {

		repository.deleteById(id);;
		return repository.findAll();
	}

}
