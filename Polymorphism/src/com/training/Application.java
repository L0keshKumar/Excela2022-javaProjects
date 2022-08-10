package com.training;

import com.training.ifaces.Condition;
import com.training.model.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory=new NewObjectFactory();
		
		Condition profesorObj=factory.getCondition(1);
		Condition studentObj=factory.getCondition(2);
		Condition principleObj=factory.getCondition(3);
		
		System.out.println(factory.getValue(profesorObj, "chennai"));
		System.out.println(factory.getValue(studentObj, "ece"));
		System.out.println(factory.getValue(principleObj, "government"));
	}

}
