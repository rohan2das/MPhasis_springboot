package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.ProductDao;
import com.test.entity.Product;
import com.test.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public Product createProduct(Product prd) {
		return repository.save(prd);
	}

	@Override
	public List<Product> readAllProduct() {
		return repository.findAll();
	}

	@Override
	public List<Product> updateProduct(Product prd) {
		repository.save(prd);
		
		return repository.findAll();
	}

	@Override
	public List<Product> deleteProduct(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

//	@Override
//	public Optional<Product> getById(int id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id);
//	}
	

	
}
