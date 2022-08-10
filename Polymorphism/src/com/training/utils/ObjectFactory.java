package com.training.utils;

import com.training.ifaces.Condition;
import com.training.model.Profeser;
import com.training.model.Student;

public class ObjectFactory {

	public Condition getCondition(int key) {
		switch(key) {
		case 1:
			return new Profeser("phd");
		case 2:
			return new Student(89);
		default:
			return null;
		}
	}
	public double getValue(Condition object,Object value) {
		
		boolean result=object.test(value);
		double travelAllowance = 500;
		if(result) {
			travelAllowance=100;
		}
		return travelAllowance;
	}
}
