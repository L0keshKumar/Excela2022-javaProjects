package com.training.iface;

import java.util.List;

import com.training.model.Book;

public interface CrudRepository {

	public boolean add(Book book);
	public Book findByBookId(int id);
	public boolean remove(Book book);
	public List<Book>findall();
	public Book update(Book book,Book recentBook);
}
  