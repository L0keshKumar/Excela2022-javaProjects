package com.training.services;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.awt.GradientPaint;
import java.util.ArrayList;
import com.training.iface.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {

	private ArrayList<Book>bookList;
	
	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book) ;
	}

	@Override
	public Book findByBookId(int id) {
		// TODO Auto-generated method stub
		Book result=null;
		for(Book eachBook:bookList) {
			if(id==eachBook.getBookNumber()) {
				result=eachBook;
			}
		}
		return result;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return bookList.remove(book);
	}

	@Override
	public List<Book> findall() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook,Book recentBook) {
		if(bookList.contains(oldBook)) {
			int idxPos=this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, recentBook);
		}
		
		return recentBook;
	}
	
	
	public List<Book> getBooksGrtThan(double price){
		Predicate<Double> drtThan=(value)->value>price;
		List<Book>grtThanList=new ArrayList<>();
		this.bookList.forEach(book->{
			double bookPrice=book.getPrice();
			if(drtThan.test(bookPrice)) {
				grtThanList.add(book);
			}
		});
		return grtThanList;
	}
	

}
