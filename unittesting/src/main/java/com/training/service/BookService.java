package com.training.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.training.model.Book;
public class BookService {

	private Set<Book> bookList;
	
	
	public BookService() {
		super();
		bookList=new HashSet<Book>();
	}


	public Set<Book> getBookList(){
		return this.bookList;
	}
	
	public int addBook(Book book) {
		 return(this.bookList.add(book))?1:0;
	}
	public boolean removeBook(Book book) {
		
		boolean result = false;
		if(this.bookList.contains(book))                           
		{
			this.bookList.remove(book);
		}else {
			throw new IllegalArgumentException("Invalid Element");
				
		}
		return result;
	}
	
	public List<String> getBestBooks(){
		List<String> list=Arrays.asList("Head First Java","PassBook","ComicBook");
		return list;
	}
	
}
