package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TripDetails;
import com.example.demo.service.TripServices;

@RestController
@RequestMapping(path = "/api/v1/trips")
public class TripServiceController {

	@Autowired
	private TripServices service;
	
	@PostMapping
	public TripDetails add(@RequestBody TripDetails entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<TripDetails> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<TripDetails> findById(@PathVariable("id") int id){
		return this.service.findById(id);
	}
	
	@GetMapping(path = "/driver/{driverId}")
	public List<TripDetails> findByDriverId(@PathVariable("driverId")int driverId){
		return this.service.findByDriverId(driverId);
				
	}
}
