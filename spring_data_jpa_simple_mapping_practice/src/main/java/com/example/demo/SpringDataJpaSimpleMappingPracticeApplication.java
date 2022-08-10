package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.EmployeeTable;

import com.example.demo.service.EmployeeTableService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaSimpleMappingPracticeApplication.class, args);
		EmployeeTableService service = ctx.getBean(EmployeeTableService.class);
		int key=3;
		switch (key) {
		case 1:
			service.findAll().forEach(System.out::println);
			break;
		case 3:
			service.findByDateOfBirth(LocalDate.of(2022,Month.MAY,24)).forEach(System.out::println);
			break;
		case 2:
			List<EmployeeTable> dobLoc=service.findByDateOfBirthAndLocation(LocalDate.of(2003,Month.FEBRUARY,14), "chennai");
			if(dobLoc.isEmpty())
			{
				System.out.println("NO ELEMENT FOUND");
			}
			dobLoc.forEach(System.out::println);
			break;
		default:
			break;
		}
		ctx.close();
	}
	
}
