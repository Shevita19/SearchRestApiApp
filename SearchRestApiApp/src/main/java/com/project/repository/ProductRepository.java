package com.project.repository;

import java.util.List;

import com.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	//create JPQL Query
	@Query("SELECT p FROM Product p WHERE " +
			"p.name LIKE CONCAT('%',:query, '%')" +
			"Or p.description LIKE CONCAT('%', :query, '%')")
	List<Product> searchProducts(String query);

}
	//SQL QUERIES
	
	/* @Query(value= "SELECT * from products p WHERE"+ 
	"p.name LIKE CONCAT ('%', :query, '%')" + 
	"Or p.description LIKE CONCAT ('%', :query,'%')", nativeQuery=true) */

	

