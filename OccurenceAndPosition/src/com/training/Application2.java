package com.training;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Application2 {

	public static void main(String[] args) {
		
		//Used to change Color in ConSole
	    final String ANSI_RESET = "\u001B[0m";
	    final String ANSI_GREEN = "\u001B[32m";
	    
	    //value and position MAP
		Map<Integer,ArrayList> positionValue=
				new TreeMap<Integer, ArrayList>();
		
		// value and Occurrence MAP
		Map<Integer,Integer> occuranceValue=
				new TreeMap<Integer, Integer>();
		
		//InputArray
		int arr[]= {2,5,7,2,5,6,6,2,5,8};
		
		//Local Variable for Collecting the Position
		ArrayList<Integer> positionList = null;
		
		//Single for Loop
		for(int i=0;i<arr.length;i++)
		{
			
			//Check if the value is Unique or Not
			if(!(positionValue.containsKey(arr[i]))&& !(occuranceValue.containsKey(arr[i]))) {
				positionList=new ArrayList<>();
				positionList.add(i);
				positionValue.put(arr[i], positionList);
				occuranceValue.put(arr[i], 1);
			}
			
			//Else we are updating the values
			else {
				ArrayList<Integer> dummy=positionValue.get(arr[i]);
				dummy.add(i);
				positionValue.put(arr[i], dummy);
				Integer OldValue=occuranceValue.get(arr[i]);
				occuranceValue.put(arr[i], ++OldValue);
			}
			
			
		}
		
		//printing the data
		for (Entry<Integer, ArrayList> entry : positionValue.entrySet()) {
	        ArrayList value = entry.getValue();
	        Integer key = entry.getKey();
	        Integer count=occuranceValue.get(key);
	        System.out.println("Number= "+key+"\nData: "+value+"\nCount:"+count+"\n");
	   }
		
		//Self Motivation
		System.out.println(ANSI_GREEN +"Jeichita maara...." + ANSI_RESET);
	
	
	}
	

}
