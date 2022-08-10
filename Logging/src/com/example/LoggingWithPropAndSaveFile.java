package com.example;

import java.io.IOException;
import java.util.logging.*;

import com.training.model.Book;

public class LoggingWithPropAndSaveFile {

	public static void main(String[] args) {
		String file = LoggingWithPropFile.class.getClassLoader()
				.getResource("logging.properties")
				.getFile();
				
				System.setProperty("java.util.logging.config.file", file);
				
				FileHandler handler;
				 try{
					 
					 handler = new FileHandler("log2.log");
					 Book.log.addHandler(handler);
					 Book.log.info("Logging Properties Done Right");
					 Book java = new Book();
					 Book.log.info(java.toString());
					 
				 }catch (SecurityException e){
					 e.printStackTrace();
				 }catch (IOException e) {
					 e.printStackTrace();
				 }
	}

}
