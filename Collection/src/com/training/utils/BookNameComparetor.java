package com.training.utils;

import java.util.Comparator;

import com.training.model.Book;

public class BookNameComparetor implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareToIgnoreCase(o2.getBookName());
	}

}
