package com.training.model;



public class app {
	
	public static void main(String[] args) {
		Integer[] list= {1,2,1,5,2,1,7,2,8};
		for(int i=0;i<list.length;i++)
		{
			int occurance=1;
			String Positions=Integer.toString(i);
			for(int j=i+1;j<list.length;j++)
			{
				if(list[i]==list[j])
				{
					occurance++;
					Positions+=Integer.toString(j);
				}
			}
			
			System.out.println(list[i]+"="+occurance+
					"\nPosition="+Positions);
			
			
			
		}
		
	}

}
