package com.training.model;

import com.training.ifaces.Condition;

public class Profeser implements Condition {

	private String qualification;
	
	public Profeser() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Profeser(String qualification) {
		super();
		this.qualification = qualification;
	}
	
	@Override
	public boolean test(Object value) {
		String strValue=(String)value;
		boolean result=false;
		if(strValue.toLowerCase().equalsIgnoreCase("Chennai")){
			result=true;
		}
		return result;
	}
	
	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	

}
