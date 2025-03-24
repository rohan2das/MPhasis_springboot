package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Product;
import com.test.exceptions.ProductNotFoundExcepton;
import com.test.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/products/v1")
@CrossOrigin("http://localhost:4200/")
@Tag(name = "Product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@PostMapping(value = "/create", consumes = "application/json" )
	
	@Operation(summary = "Springdoc open api sample API")
	public ResponseEntity<Product> createProduct(@RequestBody Product pr)
	{
		//product object
		
		Product prObj = productService.createProduct(pr);
		
		return new ResponseEntity<>(prObj, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/listall")
	public ResponseEntity<List<Product>> listAllProducts()
	{
		List<Product> listPr = productService.listAllProducts();
		
		return new ResponseEntity<>(listPr, HttpStatus.OK);
	}
	
	@GetMapping("/byid/{id}")
	public ResponseEntity<Optional<Product>> getByProductId(@PathVariable("id") int id)
	{
		Optional<Product> dt = productService.getByProductId(id);
		
		if(dt == null)
		{
			throw(new ProductNotFoundExcepton("NO_CONTENT_BY_ID"));
		}
		
		return new ResponseEntity<>(dt, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product pr, @PathVariable("id") int id)
	{
		pr.setId(id);
		
		Product obj = productService.updateProduct(pr);
		
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<Product>> deleteById(@PathVariable("id") int id)
	{
		productService.deleteProductById(id);
		
		List<Product> listD = productService.listAllProducts();
		
		return new ResponseEntity<>(listD, HttpStatus.ACCEPTED);
	}
}
