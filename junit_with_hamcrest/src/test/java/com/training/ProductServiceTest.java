package com.training;


import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.services.ProductService;

public class ProductServiceTest {

	ProductService service=null;
	
	@BeforeEach
	void init() {
		service=new ProductService();
	}
	
	@DisplayName(value = "Test findDiscount method return 10% or above")
	@Test
	void testFindDiscount() {
		String product="Tv";
		double actual=service.findDiscount(product);
		assertThat(actual,is(greaterThan(0.19)));
	}
	
	@DisplayName(value = "Test findProduct method return a list of four brands")
	@Test
	void testFindProductLength() {
		List<String> productList=service.findProduct();
		int length=productList.size();
		assertEquals(4, length);
		assertThat(4, is(equalTo(length)));
	}
	
	@DisplayName(value = "Test findProduct method return a list with Dell,Lenevo,Hp,Asus")
	@Test
	void testFindProduct() {
		List<String> productList=service.findProduct();
		assertThat(productList, is(hasItems("Lenevo","Dell","Hp","Asus")));
	}
	//contains should use when we need to check it in order 
	//hasItems can be used to find a item is there or not ordering doesn't count
}
