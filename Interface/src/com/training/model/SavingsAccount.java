package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	//Whenever subclass Constructor is caller its super class Constructor also
	//called even its super keyword is not used;
//	public SavingsAccount() {
//		super();
//		System.out.println("Constructor of SUB CLASS Called");
//	}
	//Iteration 2;
//	public SavingsAccount() {
//		super(1010,"Lokesh",5000,"fixed");
//		System.out.println("CONSTRUCTOR of SUB CLASS Called");
//	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
		//System.out.println("Nominee:----"+this.nominee);
	}
	
}
