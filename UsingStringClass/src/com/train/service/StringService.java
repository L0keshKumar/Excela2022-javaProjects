package com.train.service;

public class StringService {

	public void stringEquals(String str1,String str2) {
		System.out.println("Is value Same :-"+str1.equals(str2));
		System.out.println("Are they pointing "
				+ "to Same Location:-"+(str1==str2));
		
	}
	
	
	public void stringObjectEquals() {
		String ram=new String("Ram");
		String ramudu=new String("Ram");
		System.out.println("Is value Same? :-"+ram.equals(ramudu));
		System.out.println("Are they pointing "
				+ "to Same Location:-"+(ram==ramudu));
	}
	
	
	public void usingTrim(String name) {
//		public String usingTrim(String name) {
//		return name.trim();
		System.out.println("Before Change:-"+name);
		System.out.println("Left Trim:-"+name.trim());

	}
	
	public void lengthOfString(String name) {
//		String trimedName=usingTrim(name);
//		System.out.println("String Length:-"+trimedName.length());
		System.out.println("String Length:-"+name.trim().length());
	}
	
	public void usingSubString(String name) {
		System.out.println("Substring one parameter:-"+name.substring(4));
		System.out.println("Substring two parameter:--"+name.substring(0,4));
	}
	
	public void usingCharacterAtIndexOf(String name) {
		System.out.println("Index Position of @:-"+name.indexOf("@"));
		System.out.println("Character At position 6:-"+name.charAt(6));
	}
	
	public void usingReplace(String str1,String str2) {
		System.out.println("Replacing the cahracter:-"+str1.replace("mass", "Thamas"));
		System.out.println("Replacing the cahracter:-"+str2.replace("mass", "Thamasu"));
	}
	
	public void usingConcat(String str1,String str2) {
		//string is immutable Cannot b change
		System.out.println("str1:-"+str1);
		System.out.println("str2:-"+str2);
		System.out.println("After Concat:-"+str1.concat(str2));
		
		//string Builder is Mutable can change
		StringBuilder builder =new StringBuilder(str1);
			builder.append(str2);
			System.out.println(builder.toString());
			
		}
	
	public void usingCompareTo(String str1,String str2) {
		System.out.println("Comparing two strings:"+str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1,double mark) {
		String frmtString=String.format("Name %S", str1);
		System.out.println(frmtString);
		System.out.println(String.format("Mark %.2f", mark));
	}
	public void usingStringFormat(int mark) {
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexadecimal %x", mark));

	}


	public void usingStringFormat(int i, int j) {
		
		System.out.println(String.format("Octal %1$o \n Hexa %2$x",i,j));
	}


	public void usingStringFormat(String str1, String str2) {
		System.out.println(String.format("  %2$S \n  %1$s",str1,str2));
		//S-capital s-small
		//1$ 2$ .... n$ used for positioning
	}
	
	public void usingStringFormat(long value) {
		System.out.format("%+d",value);
	}
}



