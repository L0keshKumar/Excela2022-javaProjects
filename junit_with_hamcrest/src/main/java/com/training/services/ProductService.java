package com.training.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {

	public double findDiscount(String product) {
		
		double discount=0.10;
		if(product.equalsIgnoreCase("tv")||
				product.equalsIgnoreCase("Laptop")) {
			discount= 0.20;
		}
		return discount;
	}
	
	public List<String> findProduct(){
		//String[] list= {"Dell","Lenevo","Preadoter","Hp","Asus"};
		List<String> productList=Arrays.asList("Dell","Lenevo","Preadoter","Hp","Asus");
		return productList;
	}
}
