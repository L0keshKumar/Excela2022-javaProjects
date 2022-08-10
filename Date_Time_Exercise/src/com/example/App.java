package com.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {

		String dateOfBirth="2001-07-21";
		Student viks=new Student();
		viks.setRollNumber(87);
		viks.setStudentName("viky");
		viks.setDateOfBirth(LocalDate.parse(dateOfBirth));
		viks.setDateOfJoining(LocalDateTime.now());
		
		System.out.println(viks.getDateOfBirth().getYear());
		System.out.println(viks.getDateOfBirth().getMonth());
		System.out.println(viks.getDateOfBirth().getDayOfMonth());
		
		
		LocalDateTime startTime=LocalDateTime.now();
		
		Duration duration =Duration.of(8, ChronoUnit.HOURS);
		
		LocalDateTime endTime=startTime.plus(duration.toHours(), ChronoUnit.HOURS);
		System.out.println("Start Time"+startTime);
		System.out.println("End Time:"+endTime);
		
		
		LocalDateTime endTime2=startTime.plusHours(8);
		System.out.println("Start Time"+startTime);
		System.out.println("End Time:"+endTime2);
	}

}
