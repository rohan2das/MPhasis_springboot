package com.test.service;

import java.util.List;

import com.test.entity.Product;

public interface ProductService {
	
	public Product createProduct(Product prd);
	
	public List<Product> readAllProduct();
	
	public List<Product> updateProduct(Product prd);
	
	public List<Product> deleteProduct(int id);

//	public Product getById(int id);
}
