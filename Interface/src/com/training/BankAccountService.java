package com.training;
import java.lang.invoke.SwitchPoint;

import com.training.model.BankAccount;
public class BankAccountService {
	
	public double calculateInterest(BankAccount account) {
		double simpleIntrest=0.05;
		if(account.getAccountNumber()<5000)
		{
			simpleIntrest=0.06;
		}
		return account.getBalance()*1*simpleIntrest;
	}
	public void calculateIntrest(BankAccount[] accounts) {
		for (BankAccount eachAccount : accounts) {
			System.out.println(calculateInterest(eachAccount));
		}
	}
	public double[] findIntrest(BankAccount[] accounts) {
		int itr=0;
		double[] values=new double[accounts.length];
		for(BankAccount eachAccount:accounts)
		{
			values[itr]=calculateInterest(eachAccount);
			itr++;
		}
		return values;
	}
	private double calculateByAccountType(BankAccount account,double rateOfIntrest) {
		
		return account.getBalance()*1*rateOfIntrest;
	}
	public double[] findIntrestByAccountType(BankAccount[] accounts) 
	{
		//Using new feature of java above java 7 i.e- switchcase
		int itr=0;
		double[] values=new double[accounts.length];
		for(BankAccount eachAccount:accounts) {
			if(eachAccount!=null) {
			String key=eachAccount.getAccountType();
			switch (key) {
			case "saving":
				values[itr]=calculateByAccountType(eachAccount,0.05);
				break;
			case "fixed":
				values[itr]=calculateByAccountType(eachAccount,0.06);
				break;
			case "recurring":
				values[itr]=calculateByAccountType(eachAccount,0.07);
				break;
			default:
				break;
			}
			itr++;
			}
		}
		return values;
	}
}
