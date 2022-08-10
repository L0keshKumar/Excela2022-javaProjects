package com.example.demo;

public class Converter {
	
	public String convert(String str) {
		
		return str.toUpperCase();
	}
//	public String convert(String ch) {
//		return ch.toLowerCase();
//	} Duplicate Method
	
	//Creating a over loader method
	
	 double convert(double fahrenheit) {
		
		return (fahrenheit-32)*5/9;
	}
	 
	 public double convert(double amount,int from){
		 double responce=amount*75.9;
		 if(from>1)
			 responce =amount*84.10;
		 return responce;
		 //return (from==1)?amount*75.9:amount*84.10;
	 }
}
