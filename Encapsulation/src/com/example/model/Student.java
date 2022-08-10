package com.example.model;

public class Student {
	//Camel casing in variable name
	private int rollNumber;
	private String firstName;
	private String branch;
	private double markScored;
	
	public Student() {
		super();
		this.rollNumber =0;
		this.firstName = null;
		this.branch = null;
		this.markScored = 0.0;
	}
	
	public Student(int rollNumber, String firstName, String branch, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}
	
	
	

	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,branch,94.9);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getBranch() {
		return branch;
	}
	private void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	public double getMarkScored() {
		return markScored;
	}
	protected void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	
	
}
