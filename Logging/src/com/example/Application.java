package com.example;

import java.util.logging.*;

public class Application {

	public static void main(String[] args) {

		Logger log =Logger.
				getLogger("com.example.Application");
		log.setLevel(Level.ALL);
		//System.out.println("Info Message");
		log.info("Info Message");
		log.warning("Warning Message");
		log.severe("Sever Message");
		log.finer("Fine Message");
	}

}
