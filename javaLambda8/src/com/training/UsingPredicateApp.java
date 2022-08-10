package com.training;
import java.util.*;
import java.util.function.*;
public class UsingPredicateApp {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("India",
				"SriLanka","Iran");
		Predicate<String> containsChar=
				(countryName)->countryName.toUpperCase().startsWith("I");
//		Consumer<String>consumer=(value)->System.out.println(value);
//				names.forEach(consumer);
//		names.forEach((value)->System.out.println(value));
		
		Consumer<String> consumer =(value)->{
			if(containsChar.test(value)) {
				System.out.println(value);
			}
		};
		names.forEach(consumer);
		
	}

}
