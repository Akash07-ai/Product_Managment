package com.sales.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.product.entity.Product;
import com.sales.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product prod) {
		
		return service.addProduct(prod);
	}

	@PutMapping("/updateproduct")
	public String upadateProduct(@RequestBody Product prod) {
		// TODO Auto-generated method stub
		return service.upadateProduct(prod);
	}

	@DeleteMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return service.deleteProduct(id);
	}

	@GetMapping("/viewproduct/{id}")
	public Product viewProduct(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return service.viewProduct(id);
		
		
	}

	
	@GetMapping("/viewAllProducts")
	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		return service.viewAllProduct();
	}
	

}
