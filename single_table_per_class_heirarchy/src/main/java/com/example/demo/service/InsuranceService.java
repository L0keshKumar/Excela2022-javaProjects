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
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance lifeEntity;
	
	public void addPolicy() {
		Object obj = repo.save(entity);
		Object obj1 = repo.save(lifeEntity);
		if(obj!=null) {
			System.out.println("one record added");
		}
	}


	public void addLifePolicy() {
		Object obj1 = repo.save(lifeEntity);
		if(obj1!=null) {
			System.out.println("one record added");
		}
	}
		public void getLifePolicy() {
			repo.findAll().forEach(System.out::println);
		}


}
