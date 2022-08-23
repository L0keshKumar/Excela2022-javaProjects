package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.iface.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepository repo;
	
	public EmployeeDetails add(EmployeeDetails entity) {
		return this.repo.save(entity);
	}
	
	public List<EmployeeDetails> findall(){
		return this.repo.findAll();
	}
	
	//public List<EmployeeDetails> 
}
