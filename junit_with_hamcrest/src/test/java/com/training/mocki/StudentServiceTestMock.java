package com.training.mocki;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Student;
import com.training.service.StudentService;

public class StudentServiceTestMock {

	@DisplayName(value = "Test verify AddMethod with mock")
	@Test
	void testAddWithMock() {
		StudentServiceMock mock=new StudentServiceMock();
		
		StudentService service=new StudentService(mock);
		Student kavya=new Student(123,"lalith");
		Student jerry=new Student(234, "jerry");
		service.add(kavya);
		mock.verify(kavya, 1);
		service.add(jerry);
		
		mock.verify(jerry, 2);
	}
}
