package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Product;
import com.test.service.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private ProductService service;

	public void setService(ProductService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Product> createProduct(@RequestBody Product prd) {
		//product object
		Product prObj = service.createProduct(prd);
		
		return new ResponseEntity<>(prObj, HttpStatus.CREATED);
	}
	
	@GetMapping("/listall")
	public ResponseEntity<List<Product>> readAllProduct(){
		
		List<Product> listPr = service.readAllProduct();
		
		return new ResponseEntity<>(listPr, HttpStatus.OK);
	}
	
//	@GetMapping("/byid/{id}")
//	public Product getById(@PathVariable("id") int id){
//		return service.getById(id);
//	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<List<Product>> updateProduct(@RequestBody Product prd, @PathVariable("id") int id){
		prd.setId(id);
		service.updateProduct(prd);
		List<Product> listPr = service.readAllProduct();
		return new ResponseEntity<>(listPr, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<Product>> deleteProduct(@PathVariable("id") int id){
		
		service.deleteProduct(id);
		List<Product> listPr = service.readAllProduct();
		return new ResponseEntity<List<Product>>(listPr, HttpStatus.ACCEPTED);
	}
}
