package com.training.model;

import com.training.ifaces.Condition;

public class Principle implements Condition{
	private String type;

	
	public Principle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Principle(String type) {
		super();
		this.type = type;
	}

	


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



	@Override
	public boolean test(Object value) {
		String strBranch=(String)value;
		boolean result=false;
		if(strBranch.equalsIgnoreCase("government")) {
			result=true;
		}
		return result;
	}
}
