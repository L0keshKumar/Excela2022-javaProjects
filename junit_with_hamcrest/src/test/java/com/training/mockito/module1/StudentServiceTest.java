package com.training.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;
import com.training.service.StudentService;
public class StudentServiceTest {

	@DisplayName("Test FindAll Method with Mokito Stub")
	@Test
	void testFindall() {
		StudentRepository repo=mock(StudentRepository.class);
		StudentService service=new StudentService(repo);
		
		Student ram=new Student(202, "loki");
		Student shyam=new Student(203, "mass");
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(ram);
		studentList.add(shyam);
		
		when(repo.findAll()).thenReturn(studentList);
		
		assertEquals(service.findStudentSize(), 2);
		
	}
}
