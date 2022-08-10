package com.training.services;

public class ExceptionHandling {

	public void usingArrayIndexException(String[] args) {
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.err.println("Method requires three "
					+ "values to be passed [a,b,c]");
			//e.printStackTrace();
		}
	}
	public void usingNumberFormatException(String value) {
		
		int age=0;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Foutry five is not"
					+ " accepted 45 is acceptable");
		}
		System.out.println(age);
	}
	public void usingFinallyBlock() {
		int denominator=0;
		try {
			System.out.println(4/denominator);
		} catch (ArithmeticException e) {
			System.err.println("Denominator should not be Zero");
		}
		finally {
			System.out.println("Inside finaly ");
		}
		System.out.println("Poitu varan");
	}
	
	public String underStandFinallyBlock() throws Exception{
		int denominator=0;
		try {
			System.out.println(4/denominator);
		} catch (ArithmeticException e) {
			System.err.println("Denominator should not be Zero");
			throw new Exception();
			//return "Wellcome";
		}
		finally {
			System.out.println("Inside finaly - nee moodu");
		}
		System.out.println("Poitu varan");
		return "Nandri";
	}
	
}
