package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;
import com.training.services.Conditional;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Super type = sub type;
		//CurrencyConverter converter=new CurrencyConverter;
		Function converter=new CurrencyConverter();
		
		double responce=converter.apply(100);
		System.out.println(responce);
		System.out.println(converter.apply(500)); //11,12,13 are identical
		System.out.println(Function.COUNTER);
		
		if(converter instanceof CheckCondition)
		{
			CheckCondition object =(CheckCondition)converter;
			System.out.println("Is Discount Allowed:="+object.test(30));
		}
		
		Conditional condObj =new DiscountCalculator();
		System.out.println(condObj.test(200));
		System.out.println(condObj.negate(60000));
	}

}
