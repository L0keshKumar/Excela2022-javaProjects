package com.training;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankAccount account= new BankAccount(1010,"Lokesh",5000,"saving",);
//		System.out.println(account);
		SavingsAccount account = new SavingsAccount(1010,"Lokesh",1000,
															"saving","loki");
		System.out.println("Account Detail:----"+account.toString());
		System.out.println("Nominee:----"+account.getNominee());
		SavingsAccountService service=new SavingsAccountService();
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2=new SavingsAccountService();
		System.out.println(service2.calculateInterest(account));
		
		//service2.getCustomerInfo(account);
		//cannot access the subclass method with superclass reference;
		
		SavingsAccountService savingsService=(SavingsAccountService)service2;
		System.out.println(savingsService.getCustomerInfo(account));
		
	}

}
