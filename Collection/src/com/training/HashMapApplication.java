package com.training;
import java.util.*;

import com.training.model.Book;
public class HashMapApplication {

	public static void main(String[] args) {

		Book bookOne=new Book(100, "lokesh", "lokiMass", 999);
		Book bookTwo=new Book(101, "siva", "Millinor", 899);
		Book bookThree=new Book(102, "ram", "Billinor", 499);

		HashMap<Integer, Book> map=new HashMap<>();

		System.out.println(map.put(500, bookOne));
		System.out.println(map.put(600, bookTwo));
		Book add=map.put(600, bookThree);
		if(add!=null) {
			map.put(700, add);
		}
		System.out.println("Hello:-"+map.get(600));
		System.out.println("Hello:-"+map.get(700));
		
		
		

	}

}
