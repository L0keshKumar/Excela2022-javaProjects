package com.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.training.ifaces.EmployeeRepository;
import com.training.model.Employee;
import com.training.model.Student;

public class EmployeeService {

	EmployeeRepository repo;

	
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	
	public Employee getById(int id) {
		return this.repo.getById(id).get();
	}
	
	public Employee deleteById(int id){
		return this.repo.deleteById(id).get();
	}
	
}
