package com.training.services;

import com.training.ifaces.CheckCondition;


public interface Conditional extends CheckCondition {

	public boolean negate(int value);


}
