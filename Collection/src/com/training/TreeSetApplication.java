package com.training;

import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {

		Student shyamam=new Student(101,"zara",45);
		Student loki=new Student(102,"loki",55);
		Student rahul=new Student(103,"rahul",65);
		Student loke=new Student(102,"loki",55);

		
		TreeSet<Student>set=new TreeSet<>();
		set.add(shyamam);
		set.add(loki);
		set.add(rahul);
		set.add(loke);

		
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getFirstName());
		}
	}
  
}
