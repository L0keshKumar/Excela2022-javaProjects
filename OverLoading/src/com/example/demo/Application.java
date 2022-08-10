package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name=sc.next();
		System.out.println("Enter the Fahrenheit");
		double fahrenheit=sc.nextDouble();
		
		System.out.println("Enter the Amount:");
		double amount=sc.nextDouble();
		System.out.println("Choose 1.usd / 2.euro ");
		int to=sc.nextInt();
		
		Converter convert=new Converter();
		System.out.println("Name:"+convert.convert(name));
		System.out.println("celcius:"+convert.convert(fahrenheit));
		System.out.println("After the conversion the:"+convert.convert(amount, to));
		sc.close();
	}

}
