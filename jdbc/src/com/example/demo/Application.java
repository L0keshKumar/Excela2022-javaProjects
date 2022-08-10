package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {

		Connection con;
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			ProductService service= new ProductService(con);
			
//			Product toAdd= new Product(107,"UPS",5000.0);
//			int rowAdded=service.addProduct(toAdd);
//			System.out.println("ROW ADDED:-"+rowAdded);
			
			
//			int rowsDeleted=service.deletById(101);
//			System.out.println("ROWS DELETED:-"+rowsDeleted);
//			service.findAll().forEach(System.out::println);
			
//			Optional<Product> found=service.findById(108);
//			if(found.isPresent()) {
//				System.out.println("FOUND:="+found.get());
//			}
//			else {
//				System.out.println("PRODUCT NOT AVAILABLE");
//			}
			
			int rowsUpdated=service.updatePriceByName("UPS", 10000);
			System.out.println("ROWS UPDATED:="+rowsUpdated);
			System.out.println("----------");
			service.findAll().forEach(System.out::println);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
