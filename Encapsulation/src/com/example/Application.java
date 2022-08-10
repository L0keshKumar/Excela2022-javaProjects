package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		//Student ram=new Student();
		//ram.rollNumber=101;
		//purinjiko da its private
		
	//it is public
		//ram.setRollNumber(4052);
		
	/*//error because two package - default
		ram.setFirstName("Ram");
		
	//error because its protected
		ram.setMarkScored(99.9);
		
	//error because it is in private
		ram.setBranch("RMKCET");*/
		Student ram = new Student(4052, "Ram", "CSE");
		System.out.println("Student Name: "+ram.getFirstName());
		System.out.println("Roll Number: "+ram.getRollNumber());
		System.out.println("Mark Scored: "+ram.getMarkScored());
		System.out.println("Student Branch: "+ram.getBranch());
		Student shyam = new Student(4052, "Shyam", "ECE",99.9);
		System.out.println("\nStudent Name: "+shyam.getFirstName());
		System.out.println("Roll Number: "+shyam.getRollNumber());
		System.out.println("Mark Scored: "+shyam.getMarkScored());
		System.out.println("Student Branch: "+shyam.getBranch());
	}

}
