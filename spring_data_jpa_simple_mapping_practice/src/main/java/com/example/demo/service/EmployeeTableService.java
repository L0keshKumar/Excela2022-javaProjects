package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.EmployeeTable;
import com.example.demo.repo.EmployeeTableRepository;

@Service
public class EmployeeTableService {

	private EmployeeTableRepository repo;

	@Autowired
	public EmployeeTableService(EmployeeTableRepository repo) {
		super();
		this.repo = repo;
	}
	public EmployeeTable add(EmployeeTable entity) {
		return this.repo.save(entity);
	}
	
	public List<EmployeeTable> findAll(){
		return this.repo.findAll();
	}
	public List<EmployeeTable> findByDateOfBirthAndLocation(LocalDate date,String location){
		return this.repo.findByDateOfBirthAndLocation(date, location);
		
	}
	public List<EmployeeTable> findByDateOfBirth(LocalDate date){
		return this.repo.findByDateOfBirth(date);
		
	}
}
