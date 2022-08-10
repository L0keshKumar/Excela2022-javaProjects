package com.training;

import com.training.model.Student;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {

		Student ram=new Student(101,"ram",45);
		Student loki=new Student(102,"loki",55);
		Student rahul=new Student(103,"rahul",65);
		Student chinnnaMagesh=new Student(103,"rahul",65);
		
		HashSet<Student>set=new HashSet<>();
		set.add(ram);
		set.add(loki);
		set.add(rahul);
		set.add(rahul);
		set.add(chinnnaMagesh);
		System.out.println(set);
		System.out.println(set.size());
		

	}

}
