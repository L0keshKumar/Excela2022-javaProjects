package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;



@Service
public class DriverService {

	
	@Autowired
	private DriverRepository repo;

	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	public Driver add(Driver entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}
	
	public Driver findById(int id) {
		return this.repo.findById(id)

				.orElseThrow(()-> new RuntimeException(id+"NOT FOUND"));
	}
	


	public void deleteById(int id) {
		
		
		this.repo.deleteById(id);
	}
	
	public List<Driver> searchByDriverName(String name){
		return this.repo.findByDriverName(name);
	}

	public List<Driver> searchByMobileNumber(long number){
		return this.repo.findByMobileNumber(number);
	}
	
	public List<Driver> searchByDriverRating(double rating){
		return this.repo.searchByRating(rating);
	}
	
	public int updateRating(int id,double updateRating) {
		return this.repo.modifyRating(id, updateRating);
	}

	public List<Driver>sortedList(String propName){
		return this.repo.findAll(Sort.by(propName));
	}
	
}