package com.training.mockito.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;
import com.training.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class UsingMockitoAndAnnotation {

	@Mock
	StudentRepository repo;
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService service;
	
	@DisplayName(value = "USing Annotation")
	@Test
	void testFindall() {
		
		Student ram=new Student(202, "loki");
		Student shyam=new Student(203, "mass");
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(ram);
		studentList.add(shyam);
		
		when(repo.findAll()).thenReturn(studentList);
		
		assertEquals(service.findStudentSize(), 2);
		
	}
	
	@DisplayName(value = "Test addWithCondition Method of the service it should add element"
			+ "rollNum is grt than 2000 else return null")
	@Test
	void testAddWithCondition() {
		Student loki=new Student(2006, "kapi");
		assertNotNull(service.addWithCondition(loki));
		
	}
	
	
	@DisplayName(value = "Verify addWithCondition Method of the service it should add element"
			+ "rollNum is grt than 2000 else return null")
	@Test
	void testverifyAddWithCondition() {
		Student loki=new Student(20, "kapi");
		serviceMock.addWithCondition(loki);
		verify(serviceMock,times(1)).addWithCondition(loki);
		
		
	}
}
