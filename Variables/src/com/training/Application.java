package com.training;

public class Application {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("Lokesh",10000);
		System.out.println("Currrent Balance: "+account.getUpdatedBalance(9350));
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Current Balance: "+account.getUpdatedBalance(300));
		
		
		BankAccount account2 =new BankAccount("Kumar",20000);
		System.out.println("Currrent Balance: "+account2.getUpdatedBalance(200));
		System.out.println("Account Number: "+account2.getAccountNumber());
		System.out.println("Current Balance: "+BankAccount.getCount());
	}

}
