package com.training;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>set=new TreeSet<>();
		set.add("banana");
		set.add("apple");
		set.add("orange");
		set.add("pinaple");
		set.add("banana");
		set.add("apple");

		
		for(String eachString:set)
		{
			System.out.println(eachString);
		}
	}

}
