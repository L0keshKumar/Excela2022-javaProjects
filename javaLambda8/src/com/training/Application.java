package com.training;

import com.training.iface.Converter;
import com.training.service.CurrencyConverter;

public class Application {
	public static void printer(Converter<Double, Double>conv) {
		System.out.println(conv.convert(100.0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter<Double,Double> obj=new CurrencyConverter();
		System.out.println(obj.convert(20.0));
		
		//Lambda Expression
		Converter<Double,Double> lambda=
				(val)->800.0*val;
		System.out.println(lambda.convert(20.0));
		printer(lambda);
				
		Converter<String, Integer> strLength=
				(str)->str.length();
		System.out.println(strLength.convert("Lokimass"));

	}

}
