package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoanService;

@RestController
@RequestMapping("/api/v1")
public class LoanController {

	private LoanService service;

	@Autowired
	public LoanController(LoanService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(path = "/loans")
	public ResponseEntity<String> getLoanDetails(){
		
		double rateOfIntrest=service.getIntrestRate();
		return ResponseEntity.ok(rateOfIntrest+" Per Annum");
	}
	
	@GetMapping(path = "/loans/{value}")
	public ResponseEntity<String> getIntrestAmount(@PathVariable("value")int value){
		
		int rateOfIntrest=service.getIntrestAmount(value);
		return ResponseEntity.ok(rateOfIntrest+" Per Annum");
	}
}
