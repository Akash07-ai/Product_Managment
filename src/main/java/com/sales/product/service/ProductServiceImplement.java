package com.sales.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.product.entity.Product;
import com.sales.product.repo.ProductRepo;


@Service
public class ProductServiceImplement implements ProductService
{
	@Autowired
	ProductRepo repo;

	@Override
	public String addProduct(Product prod) {
		
		repo.save(prod);
		return "Product saved successfully";
	}

	@Override
	public String upadateProduct(Product prod) {
		// TODO Auto-generated method stub
		repo.save(prod);
		return "Product updated successfully";
	}

	@Override
	public String deleteProduct(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Product deleted successfully";
	}

	@Override
	public Product viewProduct(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
		
	}

	@Override
	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}
