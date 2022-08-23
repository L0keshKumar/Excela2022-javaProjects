package task;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import Collectiontask.Patient;
import task.service.CompareClass;

public class Streams {

	public static void main(String[] args) {
		Patient patientOne=new Patient(101, "loki", "villivakkam", 85672345);
		Patient patientTwo=new Patient(102, "rahul", "redhills", 85345345);
		Patient patientThree=new Patient(103, "1lochan", "nellor", 84562345);
		Patient patientFour=new Patient(104, "korada", "vellor", 2348763);
		Patient patientFive=new Patient(105, "Prawin", "Madurai", 9872345);

		//Vector it has extra benefits than List
		Vector<Patient> patientList=new Vector<>();
		patientList.add(patientOne);
		patientList.add(patientFour);
		patientList.add(patientThree);
		patientList.add(patientTwo);
		patientList.add(patientFive);

		//System.out.println(patientList.elementAt(2));
		
		
		
		//this will provide the whole copy of the vector
		//System.out.println(patientList.clone());
		
		
		//this sort can be used by comparator not in the comparable class
		patientList.sort(new CompareClass());
		
		//here we can use only list not vector
		//Collections.sort();
		
		patientList.forEach(System.out::println);

	}

}
