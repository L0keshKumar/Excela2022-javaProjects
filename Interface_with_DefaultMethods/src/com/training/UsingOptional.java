package com.training;

import java.util.Optional;

public class UsingOptional {

	public static Optional<String> getValue(int key){
		Optional<String> responce =Optional.empty();
		if(key==1) {
			responce=Optional.of("Hi");
		}
		return responce;
	}
	
	public static Object getString(int key) {
		switch (key) {
		case 1:
			
			return new String("ChocoBar");
		case 2:
			
			return new String("Cassatta");		
		default:
			return null;
		}
	}
	public static void main(String[] args) {
//will throw null pointer exception 
		//for value 3 and above
		//System.out.println(getString(3).toString());

//to avoid null pointer exception and return
//a default value
//New feature of java 8 optional is used
		
//		Optional<Object> optional=
//				Optional.ofNullable(getString(3));
//		System.out.println(optional.orElse(
//				"Vanilla").toString());
		
		
		
//		Optional<Object> Op2=
//				Optional.ofNullable(getString(2));
//		if(Op2.isPresent()) {
//			System.out.println("Value is present:"
//							+Op2.get());
//		}
//		else {
//			System.out.println("Value is not present");
//
//		}
		
		//Using Lambda 
//		Optional<Object> Op3=
//				Optional.ofNullable(getString(3));
//		Op3.orElseThrow(
//				()->new RuntimeException("No"
//				+ "Object For Value 3 Try Again"));
		
		
		Optional<String> optionObj=getValue(1);
		if(optionObj.isPresent())
		{
			System.out.println(optionObj.toString());
		}
		else {
			System.out.println("Invalid Choice Enter 1");

		}
		
		optionObj.orElseThrow(
				()->new RuntimeException("Exception"
						+ " Occured"));
	}

}
