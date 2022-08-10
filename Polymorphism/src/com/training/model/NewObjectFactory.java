package com.training.model;

import com.training.ifaces.Condition;
import com.training.utils.ObjectFactory;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Condition getCondition(int key) {
		switch (key) {
		case 3:
			return new Principle("governement");
			

		default:
			return super.getCondition(key);
		}
		
	}

	
	

}
