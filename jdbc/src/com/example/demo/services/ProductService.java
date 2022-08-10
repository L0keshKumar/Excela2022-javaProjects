package com.example.demo.services;

import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {
	
	private Connection con;
	
	//no 0 arguments constructor because it may form null if it called
	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	public List<Product> findAll(){
		
		List<Product> productList=new ArrayList<Product>();
		String sql="Select * From LOKI_PRODUCT";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				
				int productId=rs.getInt("PRODUCT_ID");
				String productName=rs.getString("PRODUCT_NAME");
				double price=rs.getDouble("PRICE");
			
				Product prod=new Product(productId, productName, price);
				productList.add(prod);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}
	
	public int addProduct(Product product) {
		int rowAdded=0;
		
		String sql="insert into loki_product values(?,?,?)";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			
			rowAdded=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	public int deletById(int id) {
		int rowsDeleted=0;
		
		String sql="Delete from loki_product where product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
	
			pstmt.setInt(1, id);
			rowsDeleted=pstmt.executeUpdate();
						
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsDeleted;
	}
	
	public Optional<Product> findById(int id){
		Optional<Product> obj=Optional.empty();
		String sql="Select * From Loki_product where product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
	
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int productId=rs.getInt("PRODUCT_ID");
				String productName=rs.getString("PRODUCT_NAME");
				double price=rs.getDouble("PRICE");
			
				Product prod=new Product(productId, productName, price);
				obj=Optional.of(prod);
			}
						
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public int updatePriceByName(String productName,double newPrice) {
		
		int rowsUpdated=0;
		
		String sql="update loki_product set price=? where product_name=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setDouble(1, newPrice);
			pstmt.setString(2,productName);
			rowsUpdated=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsUpdated;
		
	}
	
}
