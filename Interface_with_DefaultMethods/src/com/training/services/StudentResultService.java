package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements 
			Conditional<Double>,AgeCondition {

	@Override
	public boolean test(Double t) {
		
		return t>80;
	}

	@Override
	public boolean negate(Double age) {
		// TODO Auto-generated method stub
		//calling both super type separately
		boolean result1= Conditional.super.negate(age);
		boolean result2= AgeCondition.super.negate(age);
		if(result1 && result2) {
			return true;
		}
		else {
			return false;
		}
		
//Completely Override super type with custom type
//		if(age>80.0)
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
	}

	

	
}
