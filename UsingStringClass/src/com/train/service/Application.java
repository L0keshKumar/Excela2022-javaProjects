package com.train.service;

public class Application {

	public static void main(String[] args) {

		StringService service=new StringService();
		int key=13;
		switch (key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			//System.out.println(service.usingTrim("   lokesh   "));
			service.usingTrim("   $$$  lokimass  ");
			break;
		case 4:
			service.lengthOfString("   Lokimass  43 ");
			break;
		case 5:
			service.usingSubString(" Lo kimass");
			break;
		case 6:
			service.usingCharacterAtIndexOf("loke18@gmail.com");
			break;
		case 7:
			service.usingReplace("lokimass", "massmass");
			break;
		case 8:
			service.usingConcat("Loki", "Mass");
			break;
		case 9:
			/*str1<str2=-value, str1>str2=+value, str1==str2=0*/
			service.usingCompareTo("zzz", "aaa");
			break;
		case 10:
			service.usingStringFormat("loki", 70.4538746356);
			break;
		case 11:
			service.usingStringFormat(70);
			break;
		case 12:
			service.usingStringFormat(16,16);
			break;
		case 13:
			service.usingStringFormat("loki","mass");
			break;
		case 14:
			service.usingStringFormat(456L);
			break;
		default:
			System.out.println("dei parama olunga padi da");
			break;
		}
	}
}
