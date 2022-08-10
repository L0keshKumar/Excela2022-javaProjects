package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(101,"Ram",LocalDate.of(2001, 7, 21),LocalDateTime.of(2000,Month.JUNE,5,9,30));
		
		Student shyam=new Student(101,"Ram",LocalDate.now(),LocalDateTime.now());
		
		System.out.println("Ram Year Of Birth:"+ram.getDateOfBirth().getYear());
		System.out.println("Rams First BirthDay:"+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		
		System.out.println("Shyam Year Of Birth:"+shyam.getDateOfBirth().getYear());
		System.out.println("Shyams 60th BirthDay:"+shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
	}

	

}
