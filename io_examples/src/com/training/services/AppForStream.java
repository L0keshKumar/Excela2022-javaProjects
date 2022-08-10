package com.training.services;

import java.io.File;
import com.training.model.*;

public class AppForStream {

	public static void main(String[] args) {
		
		BookService service=new BookService();
		
		File file=new File("Book.ser");
		int ch=2;
		if(ch==1) {
		Book book=new Book(8875,"Oracle","Harish",560);
		
//		BookService service=new BookService();
//		
//		File file=new File("Book.ser");
		
		boolean result=service.writeToStream(file, book);
		
		if(result) {
			System.out.println("One Record Serialized");
		}
		}
		else {
			Book fromFile=(Book) service.readFromStream(file);
			System.out.println(fromFile.getBookName());
			System.out.println(fromFile);
		}
	}

}
