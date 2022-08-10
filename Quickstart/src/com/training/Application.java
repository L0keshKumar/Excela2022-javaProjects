package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting Gobj=new Greeting();
		
		/*System s= new System();
		 * System has a private constructor*/
		
		System.out.println(Gobj.getMessage());
		System.out.println(Greeting.getInfo());
		
		
		//System.out.println(Gobj.getInfo());
/*calling static method by class is static way
 No error but warning will occur*/
	}
}