package com.training.ifaces;

public interface AgeCondition {
	
	default boolean negate(Double age) {
		return age<=50;
	}
}
