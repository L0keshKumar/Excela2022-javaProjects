package com.training.model;

public class Book implements Comparable<Book>{

	private int bookNumber;
	private String author;
	private String bookName;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String author, String bookName, double price) {
		super();
		this.bookNumber = bookNumber;
		this.author = author;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", author=" + author + ", bookName=" + bookName + ", price=" + price
				+ "]";
	}
	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
		if(otherObj.bookNumber<this.bookNumber)return 1;
		if(otherObj.bookNumber>this.bookNumber)return -1;
		return 0;
		//return otherObj.bookName.compareToIgnoreCase(this.bookName);
	}
	
}
