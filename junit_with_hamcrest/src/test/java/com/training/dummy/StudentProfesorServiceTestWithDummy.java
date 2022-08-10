package com.training.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.fake.StudentRepoFake;
import com.training.model.Student;
import com.training.service.StudentProfessorService;

public class StudentProfesorServiceTestWithDummy {

	@Test
	@DisplayName(value = "Test Add Method Return instead object back")
	void testAddMethod() {
		StudentRepoFake repo=new StudentRepoFake();
		ProfesorRepoDummy dummy=new ProfesorRepoDummy();
		StudentProfessorService service= new StudentProfessorService(repo, dummy);
		Student ram=new Student(201, "lokesh");
		Student actual= service.add(ram);
		assertEquals(actual, ram);
	}
}
