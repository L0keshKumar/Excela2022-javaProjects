package com.training;

import java.util.*;

import com.training.iface.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparetor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=new ArrayList<>();
		names.add("1loki");
		names.add("2Zara");
		names.add("vino");
		names.add("Kumar");
		names.add("alex");
		//sort value from 1-9 then A-Z then a-z

		System.out.println("Munadi"+names);
		Collections.sort(names);
		System.out.println("Pinadi"+names);
		Book bookOne=new Book(100, "lokesh", "lokiMass", 999);
		Book bookTwo=new Book(101, "siva", "Millinor", 899);
		Book bookThree=new Book(102, "mohan", "King", 499);
		Book bookFour=new Book(103, "mani", "Ting", 1999);
		Book bookFive=new Book(104, "suresh", "Travel", 989);
		
		CrudRepository service=new BookService();
		System.out.println("Book is Added?-"+service.add(bookOne));
		System.out.println("Book is Added?-"+service.add(bookTwo));
		System.out.println("Book is Added?-"+service.add(bookThree));
		System.out.println("Book is Added?-"+service.add(bookFour));
		System.out.println("Book is Added?-"+service.add(bookFive));
		List<Book> bookList =service.findall();
		Collections.sort(bookList);
		System.out.println(bookList);
		Collections.sort(bookList, new BookNameComparetor());
		System.out.println(bookList);



	}

}
