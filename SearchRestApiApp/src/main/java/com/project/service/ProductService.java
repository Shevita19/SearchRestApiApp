package com.project.service;

import java.util.List;

import com.project.model.Product;

public interface ProductService {
	
	List<Product> searchProducts(String query);

	Product createProduct(Product product);

}
