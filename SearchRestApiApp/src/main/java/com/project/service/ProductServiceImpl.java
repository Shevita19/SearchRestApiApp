package com.project.service;

import java.util.List;

import com.project.model.Product;
import com.project.service.ProductService;
import org.springframework.stereotype.Service;

import com.project.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {


	private final ProductRepository productRepository;
	
	
	//@Autowired, will not be added coz spring framework will automatically add autowired when it find only one constructor fr this class.
	public ProductServiceImpl(ProductRepository productRepository) {    //constructor based dependency injection
		//super();
		this.productRepository = productRepository;
		
	}

	@Override
	public List<Product> searchProducts(String query) {
		List<Product> products= productRepository.searchProducts(query);
		return products;
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
