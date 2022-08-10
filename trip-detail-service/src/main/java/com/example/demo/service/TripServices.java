package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TripDetails;
import com.example.demo.repos.TripDateRepository;

@Service
public class TripServices {

	@Autowired
	private TripDateRepository repo;
	//Add
	public TripDetails save(TripDetails entity) {
		return repo.save(entity);
		
	}
	//find By id
	public Optional<TripDetails> findById(Integer id){
		return repo.findById(id);
	}
	//find by driver Id
	public List<TripDetails> findByDriverId(Integer driverId){
		return repo.findByDriverId(driverId);
	}
	//find All
	public List<TripDetails> findAll(){
		return repo.findAll();
	}
}
