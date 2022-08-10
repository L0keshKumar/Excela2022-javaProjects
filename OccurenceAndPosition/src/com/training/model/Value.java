package com.training.model;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Value {
	public int value;
	public String occurance;
	Map<Integer,String> set=new TreeMap<Integer,String>();
	public Value() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Value(int value, String occurance) {
		super();
		this.value = value;
		this.occurance = occurance;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getOccurance() {
		return occurance;
	}
	public void setOccurance(String occurance) {
		this.occurance = occurance;
	}
	
	
	public Map<Integer, String> getSet() {
		return set;
	}
	public void setSet(Map<Integer, String> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "Value [value=" + value + ", occurance=" + occurance + "]";
	}
	
}
