package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FruitService {
public Object readFromStream(File file) {
		
		Object obj=null;
		
		try (ObjectInputStream inStream=
				new ObjectInputStream(new FileInputStream(file))){
			
			obj=inStream.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ClassNotFound");
		}
		
		return obj;
	}
}
