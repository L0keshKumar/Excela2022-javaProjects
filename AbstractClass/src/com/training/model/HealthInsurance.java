package com.training.model;

public class HealthInsurance extends Insurance {

	private String[] preExisitingDisease;
	
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExisitingDisease) {
		super(policyNumber, policyHolderName);
		this.preExisitingDisease = preExisitingDisease;
	}
	
	public String[] getPreExisitingDisease() {
		return preExisitingDisease;
	}

	public void setPreExisitingDisease(String[] preExisitingDisease) {
		this.preExisitingDisease = preExisitingDisease;
	}
	

	@Override
	public double calculatePremium() {
		double premium=10000;
		for(String eachItem:preExisitingDisease) {
//			String item=eachItem.toLowerCase();
//			if(item.equals("BP") || item.equals("sugar")) {
//				premium=15000;
//			}
			if(eachItem.equalsIgnoreCase("BP")||eachItem.equalsIgnoreCase("sugar")) {
				premium=15000;
			}
		}
		return premium;
	}

}
