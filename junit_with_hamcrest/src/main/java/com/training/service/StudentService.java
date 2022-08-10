package com.training.service;

import java.util.List;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;

public class StudentService {

	private StudentRepository repo;
	
	
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public Student add(Student entity) {
		return this.repo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.repo.findAll();
	}
	public int findStudentSize() {
		return this.repo.findAll().size();
	}
	
	public Student addWithCondition(Student entity) {
		Student result=null;
		if(entity.getRollNumber()>2000)
		{
			 this.repo.add(entity);
			 result=entity;
		}
		return result;
	}
}
