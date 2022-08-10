package com.training;

public class Application {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		
//		int value =Integer.parseInt(args[0]);
//		System.out.println(++value);
		
		CurrencyConverter cnv=new CurrencyConverter();
		double value=Double.parseDouble(args[0]);
		//System.out.println(cnv.inrToUsd(Double.parseDouble(args[0])));
		System.out.println(cnv.inrToUsd(value));
		
		//Double inrValue=Double.parseDouble(args[1]);
		//AutoBoxing is Done
		double inrValue=Double.parseDouble(args[1]);
		System.out.println(cnv.inrToEuro(inrValue));
		
		double salary =10000.00;
		int intSal=(int)salary;
		int age=42;
		
		String strAge=Integer.toString(age);
		int intAge=Integer.valueOf(strAge);
		
	}

}
