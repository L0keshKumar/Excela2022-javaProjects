package com.example.demo.controller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.*;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {
	
	private DriverService service;
	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}

	@GetMapping(path ="/drivers")
	public List<Driver> getAllDrivers(){
		
		return this.service.findAll();
		}
	
	@GetMapping(path ="/drivers/srch/id/{id}")
	public Driver getDriverById(@PathVariable("id") int id) {
		
		return this.service.findById(id);
		}
	
//	@PostMapping(path = "/drivers")
//	public Driver addDriver(@RequestBody Driver entity) {
//		
//		return this.service.add(entity);
//	}
//	
	
	@PostMapping(path = "/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		
		Driver driver = this.service.add(entity);
		
		URI location = ServletUriComponentsBuilder
					.fromCurrentRequest()			//http://localhost:8080/api/v1/drivers
						.path("/{id}")				//http://localhost:8080/api/v1/drivers/{id}
						 .buildAndExpand(entity		//http://localhost:8080/api/v1/drivers/102\5
					      .getDriverId())
						  .toUri();
							
		
		return ResponseEntity.created(location).body(driver);
	}
	
	@DeleteMapping(path ="/drivers/delete/{id}")
	public ResponseEntity<String>  deleteById(@PathVariable("id") int id) {
		
		 this.service.deleteById(id);
		 return ResponseEntity.status(204).body("one row deleted"+id);
		 //return ResponseEntity.ok().body("one row deleted"+id);
		}
	@GetMapping(path ="/drivers/srch/mobilenumber/{mobileNumber}")
	public List<Driver> getDriverById(@PathVariable("mobileNumber") long mobileNumber) {
		
		return this.service.searchByMobileNumber(mobileNumber);
		}
	
	@PutMapping(path="drivers/update/{id}/{rating}")
	public ResponseEntity<String> updateRating(@PathVariable("id") int id,@PathVariable("rating")double updateRating){
		int val=this.service.updateRating(id, updateRating);
		if(val!=0) {
			return ResponseEntity.status(200).body("Updated!!");
		}
		else {
			return ResponseEntity.status(500).body("Not Updated");
		}
	}
	
	@GetMapping(path ="/drivers/srch/name/{driverName}")
	public List<Driver> getDriverById(@PathVariable("driverName") String driverName) {
		
		return this.service.searchByDriverName(driverName);
		}
	
	@GetMapping(path ="/drivers/srch/rating/{driverRating}")
	public List<Driver> getDriverById(@PathVariable("driverRating") double driverRating) {
		
		return this.service.searchByDriverRating(driverRating);
		}
	@GetMapping(path ="/drivers/sort/{propName}")
	public List<Driver> getSortedName(@PathVariable("propName")String propName){
		return this.service.sortedList(propName);
	}
	

}


