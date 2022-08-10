package com.training;

import java.util.*;

import com.training.model.Book;

public class HashMapApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bookOne=new Book(100, "lokesh", "lokiMass", 999);
		Book bookTwo=new Book(101, "siva", "Millinor", 899);
		Book bookThree=new Book(102, "ram", "Billinor", 499);

		HashMap<Integer, Book> map2=new HashMap<>();
		map2.put(900,bookOne);
		map2.put(901,bookTwo);
		map2.put(902,bookThree);
		
		System.out.println("Hello:-"+map2.get(900));
		System.out.println("Hello:-"+map2.get(901));
		System.out.println("Hello:-"+map2.get(902));

		Set<Integer> keys=map2.keySet();//get Keys
		for(Integer eachKey:keys) {
			System.out.println(map2.get(eachKey));
		}
		
		Collection<Book> list= map2.values();//get Value
		for(Book eachValue:list) {
			System.out.println(eachValue);
		}
		
		//Both key and value
		Set<Map.Entry<Integer, Book>> list2 =map2.entrySet();
		for(Map.Entry<Integer, Book> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
//			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry);
		}
	}

}
