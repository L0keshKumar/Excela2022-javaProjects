package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

	public double getIntrestRate() {
		return 4.5;
	}
	public int getIntrestAmount(int value) {
		System.out.println("Value--- :"+value);
		return value*45;
	}
}
