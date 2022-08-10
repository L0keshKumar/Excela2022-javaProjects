package com.training;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Book;

public class UsingStreams {

	public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
	}
	
	
	
	
	public static void collectToSet(List<Book> bookList) {
		Set<Book> bookSet=bookList
				.stream()
				.filter(e->e.getPrice()>500)
				.collect(toSet());
		bookSet.forEach(System.out::println);
	}
	
	
	
	
	
	public static void collectToMap(List<Book> bookList) {
		Map<String, Double>values =bookList.stream()
				.distinct()
				.filter(e->e.getPrice()>500)
				
				.collect(toMap(Book::getBookName,Book::getPrice));
		
		values.forEach((key,value)->System.out.println(key+","+value));
	}
	
	
	
	public static void findMaxPrice(List<Book> bookList) {
		Optional<Book> optional=bookList.stream()
				.max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Maximum Price:"+optional.get());
		}
	}
	
	
	public static void findMinPrice(List<Book> bookList) {
		Optional<Book> optional=bookList.stream()
				.min(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Minimum Price:"+optional.get());
		}
	}
	
	
	public static void containsVinBookName(List<Book> bookList) {
		long count=bookList.stream()
				.filter(e-> e.getBookName().contains("i"))
				.count();
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		Book bookOne=new Book(100, "lokesh", "lokiMass", 999);
		Book bookTwo=new Book(101, "siva", "Millinor", 899);
		Book bookThree=new Book(102, "mohan", "King", 299);
		Book bookFour=new Book(103, "kani", "Ting", 1999);
		Book bookFive=new Book(101, "suresh", "Travel", 989);
		Book bookNewTwo=new Book(101, "siva", "Millinor", 899);
		Book bookNewFour=new Book(103, "kani", "Ting", 1999);
		List<Book>bookList=
				Arrays.asList(bookOne,bookTwo,
						bookThree,bookFour,bookFive,
						bookNewTwo,bookNewFour);
		
		int key=6;
		switch (key) {
		case 1:
			useDistinct(bookList);
			break;
		case 2:
			collectToSet(bookList);
			break;
		case 3:
			collectToMap(bookList);
			break;
		case 4:
			findMaxPrice(bookList);
			break;
		case 5:
			findMinPrice(bookList);
			break;
		case 6:
			containsVinBookName(bookList);
			break;
		
		default:
			System.out.println("-------i--i------");
			break;
		}
	}

}
