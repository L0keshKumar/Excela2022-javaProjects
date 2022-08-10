package com.training.fake;

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;

public class StudentRepoFake implements StudentRepository {

	List<Student> list;
	
	

	public StudentRepoFake() {
		super();
		list=new ArrayList<Student>();
	}

	@Override
	public Student add(Student entity) {
		// TODO Auto-generated method stub
		return list.add(entity)?entity:null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return list;
	}

}
