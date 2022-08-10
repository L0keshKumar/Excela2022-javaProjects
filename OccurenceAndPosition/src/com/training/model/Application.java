package com.training.model;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Application {
	static List<Integer> inputList=new ArrayList<Integer>();
	static Map<Integer,String> outputList=new HashMap<Integer, String>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		while(true) {
//			System.out.println("If you want to End press 0 else 1");
//			int key=sc.nextInt();
//			switch(key) {
//			default:System.out.println("Enter the number:");
//					inputList.add(sc.nextInt());
//					break;
//			case 0:System.out.println("ThankYou");break;
//			}
//		}
		inputList.add(1);
		inputList.add(2);
		inputList.add(4);
		inputList.add(3);
		inputList.add(3);
		inputList.add(2);
		inputList.add(1);
		inputList.add(2);
		//Integer[] list=inputList;
		for(Integer eachValue:inputList) {
			System.out.println(eachValue);
			outputList.put(eachValue, getPosition(eachValue));
		}
		System.out.println("****************************");
		for(Integer eachKey:outputList.keySet()) {
			System.out.println(eachKey);
			System.out.println(outputList.get(eachKey));
		}
	
	}
	public static String getPosition(int value) {
		String occurance="";
		for(Integer eachValue:inputList)
		{
			if(value==eachValue) {
				//occurance+=Integer.toString((eachValue));
			}
		}
		return occurance;
		
		
	}
	

}
