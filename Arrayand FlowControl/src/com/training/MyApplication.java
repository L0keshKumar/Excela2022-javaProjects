package com.training;
import com.training.model.BankAccount;
import com.training.service.BankAccountService;
import java.util.Scanner;
public class MyApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccountService service=new BankAccountService();
		int i=0,end;
		BankAccount[] list=new BankAccount[5];
		//BankAccountService service=new BankAccountService();
		do {
			//BankAccount account= new BankAccount();
			System.out.println("Enter Acount Number: ");
			int accountNumber= sc.nextInt();
			System.out.println("Enter Name: ");
			String accountHolderName= sc.next();
			System.out.println("Enter Balance");
			double balance=sc.nextLong();
			System.out.println("Enter Account Type");
			String accountType=sc.next();
			BankAccount account =new BankAccount(accountNumber, accountHolderName, balance, accountType);
			list[i]=account;
			System.out.println("Enter 1 to continue else enter 0:");
			end=sc.nextInt();
			//System.out.println("end:"+end);
			i++;
		}while(end==1);
		//System.out.println(list[1]);
		double[] intrestValue=service.findIntrestByAccountType(list);
		for(double eachValue:intrestValue)
		{
			System.out.println(eachValue);
		}
		sc.close();
	}

}
