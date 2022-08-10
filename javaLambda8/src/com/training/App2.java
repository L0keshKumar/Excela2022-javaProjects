package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("India",
				"SriLanka","Iran");
		names.forEach(value->System.out.println(value));
		
		//method reference
		names.forEach(System.out::println);
		
		
		Predicate<String> containsChar=
				(countryName)->countryName.toUpperCase().startsWith("I");
		//containsChar.forEach(values->System.out.println(values));
				//containsChar.forEach((value)->System.out.println(value));
				//System.out.println(containsChar.);	
	}

}
