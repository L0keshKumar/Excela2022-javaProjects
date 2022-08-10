package com.training.model;

import java.io.Serializable;

public class Book implements Comparable<Book>,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2022L;
	private int bookNumber;
	private String author;
	private String bookName;
	private double price;
	private double discount;
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
	
	public Book(int bookNumber, String author, String bookName, double price, double discount) {
		super();
		this.bookNumber = bookNumber;
		this.author = author;
		this.bookName = bookName;
		this.price = price;
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
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
		return  bookNumber + "," + author + "," + bookName + "," + price;
	}
	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
		if(otherObj.bookNumber<this.bookNumber)return 1;
		if(otherObj.bookNumber>this.bookNumber)return -1;
		return 0;
		//return otherObj.bookName.compareToIgnoreCase(this.bookName);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookNumber;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookNumber != other.bookNumber)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	
}
