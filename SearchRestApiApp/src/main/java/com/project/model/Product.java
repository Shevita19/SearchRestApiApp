package com.project.model;

import java.time.LocalDateTime;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor 
@Data
@Entity                                       //to make it jpa entity
@Table					//configure table details fr this product entity

public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)              //Use to autoIncrement primary key
	private Long id;
	private String sku;
	private String name;
	private String description;
	private boolean active;
	private String imageUrl;
	@CreationTimestamp             						 //Hibernate provides, when we save product hibernate will auto assign value fr this property.
	private LocalDateTime dataCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;
	
}
	

