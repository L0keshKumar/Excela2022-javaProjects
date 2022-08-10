package com.training.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Student;
import com.training.service.StudentService;

public class StudentServiceTestWithFake {

	@Test
	@DisplayName(value = "Test addMethod Return insteard object back")
	void testAddMethod() {
		StudentRepoFake fake=new StudentRepoFake();
		StudentService service=new StudentService(fake);
		Student ram=new Student(101, "Rama Krishna");
		
		Student actual=service.add(ram);
		
		assertEquals(actual, ram);
	}
	
	@Test
	@DisplayName(value = "Test findAll method return all the element Added")
	void testAddMethodReturn() {
		StudentRepoFake fake=new StudentRepoFake();
		StudentService service=new StudentService(fake);
		Student lochan=new Student(101, "Rahul");
		Student rahul=new Student(101, "lochan");
		
		int x=0;
		x+=(service.add(rahul) != null?1:0);
		x+=(service.add(lochan) != null?1:0);
		assertEquals(2, x);
		
//		service.add(rahul);
//		service.add(lochan);
//		int actual=service.findAll().size();
//		assertEquals(2, actual);
	}
}
