package com.training.ifaces;

import java.util.List;

import com.training.model.Student;

public interface StudentRepository {

	public Student add(Student entity);
	public List<Student> findAll();
	
}
