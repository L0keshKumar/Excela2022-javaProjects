package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;

import com.training.model.Book;

public class LoggingWithPropFile {

	public static void main(String[] args) {

		String file=LoggingWithPropFile.class
				.getClassLoader()
					.getResource("logging.properties")
						.getFile();
		System.setProperty("java.util.logging.config.file",
				file);
		try {
			FileHandler handler=new FileHandler("logs.log");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Book.log.info("Logging properties Done Right");
		Book java=new Book();
		
		System.out.println(java);

		Book.log.info(java.toString());
	}

}
