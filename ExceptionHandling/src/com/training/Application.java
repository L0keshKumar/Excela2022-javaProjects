package com.training;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
//		Student loki=null;
//		try {
//			loki = new Student(4052, "lokesh", 90);
//		} catch (RangeCheckException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		StudentService service=new StudentService(loki);
//		System.out.println(service.sendDetails());
//		
//		StudentService service2=new StudentService(loki);
//		try {
//			System.out.println("GRADE:"+service2.findRank());
//			System.out.println("Summa");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.err.println("Name is not passed");
//		}
		
		ExceptionHandling exHandling = new ExceptionHandling();
//		exHandling.usingArrayIndexException(args);
//		
//		exHandling.usingNumberFormatException("45");
//		
		//exHandling.usingFinallyBlock();
		try {
			System.out.println(exHandling.underStandFinallyBlock());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// since we are using try with resource - 
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Number");
			int num=sc.nextInt();
			System.out.println(num);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
