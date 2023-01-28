package com.project.controller;

import java.util.List;

import com.project.model.Product;
import com.project.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")    		//define base url fr mvc controller
public class ProductController {

	//@Autowired
	private final ProductService productService;

	public ProductController(ProductService productService) {
		
		this.productService = productService;
	} 
	
	
	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("query")String query){
		return ResponseEntity.ok(productService.searchProducts(query));
	}
	 
	@PostMapping
	public  Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
}
