package com.training;

public class BankAccount {
	//static variable
	private static int count;
	
	//instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	
	
	
	
	

	public String getAccountHolderName() {
		return accountHolderName;
	}



	/*public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}*/



	public double getBalance() {
		return balance;
	}



	/*public void setBalance(double balance) {
		this.balance = balance;
	}



	public static void setCount(int count) {
		BankAccount.count = count;
	}*/



	public BankAccount(String accountHolderName, double balance) {
		//super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
		
	}
	


	/*public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}*/



	public int getAccountNumber() {
		return accountNumber;
	}



	/*public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}*/



	//static method
	public static int getCount()
	{
		return ++count;
	}
	
	//instance method
	public double getUpdatedBalance(double amount){//parameter variable
		//local variables
		//double updatedBalance=200.0;
		//double currentBalance=0.0;
		
		//Local variable should be initialized before use
 		//System.out.println(updatedBalance);
		
		/*currentBalance = this.balance+amount;
		this.balance=currentBalance;
		return currentBalance;*/
		this.balance=this.balance+amount;
		return this.balance;
	}
}
