package com.example.demo.controller;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetails;
import com.example.demo.entity.TripDto;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private TripDto dto;
//	@GetMapping(path = "/drivers")
//	public String getDrivers() {
//		return this.template
//				.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
//	}
//	
//	
//	@GetMapping(path = "/drivers/json")
//	public CabDriver[] getDriversAsJson() {
//		return this.template
//				.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver[].class);
//	}
	@GetMapping(path = "/driver/trips/{id}")
	public TripDto getDriverTrips(@PathVariable("id") int id) {

//	String driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, String.class);
//	String trips=this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/driver"+id,String.class);
//	return driver+trips;
		
		CabDriver driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, CabDriver.class);
		
		TripDetails[] trips= this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/driver/"+id,TripDetails[].class);
		System.out.println("driver"+driver);
		System.out.println("trips"+trips);
		dto.setDriver(driver);
		
		Set<TripDetails> detail = Arrays.stream(trips).collect(Collectors.toSet());
		
		dto.setTrips(detail);
		
		return dto;
	}
	
	
	
}
