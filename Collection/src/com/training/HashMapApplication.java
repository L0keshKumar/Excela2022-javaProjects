package com.training;
import java.util.*;

import java.util.Map.*;
import java.util.stream.Collectors;

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
		
		
		TreeMap<Integer, Integer> one=new TreeMap<>();
		one.put(101, 200);
		one.put(102, 300);
		one.put(103, 400);
		TreeMap<Integer, Integer> two=new TreeMap<>();
		two.put(201, 400);
		two.put(202, 600);
		int x=0;
		for (Entry<Integer, Integer> inte : one.entrySet()) {
			x=inte.getKey();
		}
		List<Integer> mapToList=two.values().stream().collect(Collectors.toList());

	}

}
