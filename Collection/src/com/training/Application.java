package com.training;

import java.util.List;
import java.util.Optional;

import com.training.iface.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void print(List<Book> booArraykList) {
		for(Book eachBook:booArraykList) {
			System.out.println(eachBook);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bookOne=new Book(100, "lokesh", "lokiMass", 999);
		Book bookTwo=new Book(101, "siva", "Millinor", 899);
		Book bookThree=new Book(102, "mohan", "King", 299);
		Book bookFour=new Book(103, "mani", "Ting", 1999);
		Book bookFive=new Book(104, "suresh", "Travel", 989);
		
		CrudRepository service=new BookService();
		System.out.println("Book is Added?-"+service.add(bookOne));
		System.out.println("Book is Added?-"+service.add(bookTwo));
		System.out.println("Book is Added?-"+service.add(bookThree));
		System.out.println("Book is Added?-"+service.add(bookFour));
		System.out.println("Book is Added?-"+service.add(bookFive));
		
		print(service.findall());
//		List<Book> bookList =service.findall();
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
		System.out.println("the element we need:"+service.findByBookId(102));
		//System.out.println("The object i need to be delete-"+service.remove(bookTwo));
		System.out.println("-----------------------");
		//print(service.findall());
		
		Book bookSix=new Book(106, "loki", "Kill", 1499);
		service.add(bookSix);
		print(service.findall());
		System.out.println("-----------------------");
		Book bookSix1=new Book(106, "loki", "Kill", 499);
		

		service.update(bookSix,bookSix1);
		print(service.findall());
		System.out.println("-------------------------");
		List<Book> bookList=((BookService)service).getBooksGrtThan(1000);
		//Optional<List<Book>> optList=bookList;
		//List<Optional<Book>>optList=bookList;
		bookList.forEach(System.out::println);

	}
	

}
