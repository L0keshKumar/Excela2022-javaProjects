package com.training;


import com.training.ifaces.Conditional;
import com.training.services.StudentResultService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentResultService service=new 
				StudentResultService();
		System.out.println(service.test(81.0));
		
		System.out.println(service.negate(50.0));
		System.out.println(Conditional.getMeaasge());
	}

}
