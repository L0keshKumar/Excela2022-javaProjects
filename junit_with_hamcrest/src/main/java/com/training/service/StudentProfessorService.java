package com.training.service;

import java.util.List;

import com.training.ifaces.ProfesorRepository;
import com.training.ifaces.StudentRepository;
import com.training.model.Student;

public class StudentProfessorService {

private StudentRepository repo;
private ProfesorRepository profRepo;
	
	

	public StudentProfessorService(StudentRepository repo, ProfesorRepository profRepo) {
	super();
	this.repo = repo;
	this.profRepo = profRepo;
}

	public Student add(Student entity) {
		return this.repo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.repo.findAll();
	}
}
