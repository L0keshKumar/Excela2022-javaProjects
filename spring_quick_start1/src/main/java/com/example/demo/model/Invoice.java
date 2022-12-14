package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@Component
public class Invoice {
	
	Customer customer;
	Product product;
	
	
	@Autowired//autowired is optional for constructor
	public Invoice(@Qualifier("magesh")Customer customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	
	
}
