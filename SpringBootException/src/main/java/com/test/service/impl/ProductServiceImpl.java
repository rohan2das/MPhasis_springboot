package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ProductDao;
import com.test.entity.Product;
import com.test.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product createProduct(Product prd) {
		try {
			if(prd!=null) {
				productDao.createProduct(prd);
			}
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		return prd;
	}

	@Override
	public List<Product> readAllProduct() {

		List<Product> list = productDao.readAllProduct();
		
//		if(list.size() <0) {
//			System.out.println("no content");
//		}
		
		return list;
	}

	@Override
	public List<Product> updateProduct(Product prd) {
		try {
			if(prd!=null) {
				productDao.updateProduct(prd);
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return productDao.readAllProduct();
	}

	@Override
	public List<Product> deleteProduct(int id) {
		try {
			if(id!=0) {
				productDao.deleteProduct(id);
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return productDao.readAllProduct();
	}

//	@Override
//	public Product getById(int id) {
//		// TODO Auto-generated method stub
//		return productDao.getById(id);
//	}

}
