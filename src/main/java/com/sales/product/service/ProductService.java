package com.sales.product.service;

import java.util.List;

import com.sales.product.entity.Product;


public interface ProductService {
	
	String addProduct(Product prod);
	String upadateProduct(Product prod);
	String deleteProduct(Long id);
	Product viewProduct(Long id);
	List<Product> viewAllProduct();

}
