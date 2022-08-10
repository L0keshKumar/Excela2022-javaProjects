package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance healthEntity;
	
	@Autowired
	LifeInsurance lifeEntity;
	
	public void addHealthPolicy() {
		Object obj=repo.save(healthEntity);
		
		if(obj!=null)
			System.out.println("One Record Added");
	}
	
	public void getHealthPolicy() {
		repo.findHealthInsurance().forEach(System.out::println);
	}
	
	public void addLifePolicy() {
		Object obj=repo.save(lifeEntity);
		
		if(obj!=null)
			System.out.println("One Record Added");
	}
	public void getLifePolicy() {
		repo.findLifeInsurance().forEach(System.out::println);
	}
}
