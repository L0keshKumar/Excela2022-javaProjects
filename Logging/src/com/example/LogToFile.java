package com.example;
import java.io.IOException;
import java.util.logging.*;
public class LogToFile {

	public static void main(String[] args) {

		Logger log=
				Logger.getLogger(LogToFile
						.class.getName());
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log",true);
			log.addHandler(handler);
			throw new RuntimeException("K is great Programmer");
			//log.info("Try Block Called");
		} catch (SecurityException e) {
			log.warning(e.getMessage());
		} catch (IOException e) {
			log.warning(e.getMessage());
		} catch (Exception e) {
			log.warning(e.getMessage());

		}
		
		
		
	}

}
