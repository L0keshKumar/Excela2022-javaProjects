package com.training.ifaces;

@FunctionalInterface
public interface Conditional<T> {
	
	public boolean test(T t);
	default boolean negate(Double t) {
		return t<=80.0;
	}
	public static String getMeaasge() {
		return "i am Static In Interface"
				+ " purinjitha static interface....";
		
	}
}
