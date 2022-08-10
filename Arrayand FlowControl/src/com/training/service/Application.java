package com.training.service;
import com.training.model.BankAccount;;
public class Application {

	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
//		BankAccount loki=new BankAccount(1200,"Lokesh",1000,"fixed");
////		double simpleIntrest=service.calculateInterest(loki);
////		System.out.println("Simple Intrest: "+simpleIntrest);
////		
//		BankAccount rahul=new BankAccount(12000,"Rahul",1000,"saving");
////		double simpleIntrest1=service.calculateInterest(rahul);
////		System.out.println("Simple Intrest: "+simpleIntrest1);
////		
//		BankAccount yovel=new BankAccount(100,"Yovel",1000,"recurring");
////		double simpleIntrest2=service.calculateInterest(yovel);
////		System.out.println("Simple Intrest: "+simpleIntrest2);
//		
//		
////		BankAccount[] accounts=new BankAccount[5];
////		accounts[0]=loki;
////		accounts[1]=rahul;
////		accounts[2]=yovel;
////		service.calculateIntrest(accounts);
//		BankAccount[] accounts= {loki,rahul,yovel};
//		//service.calculateIntrest(accounts);
//		
//		double[] values=service.findIntrestByAccountType(accounts);
////		for(int i=0;i<values.length;i++){
////			System.out.println(values[i]);
////		}
//		for(double eachValue:values)
//		{
//			System.out.println(eachValue);
//		}
		BankAccount[] accountList= {
				new BankAccount(1200,"Lokesh",1000,"fixed"),
				new BankAccount(12000,"Rahul",1000,"saving"),
				new BankAccount(100,"Yovel",1000,"recurring")
		};
		double[] intrestValue=service.findIntrestByAccountType(accountList);
			for(double eachValue:intrestValue)
			{
				System.out.println(eachValue);
			}
	}

}
