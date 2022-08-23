package task;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import Collectiontask.Doctor;
import Collectiontask.Patient;

public class Application2Object {

	public static void main(String[] args) {
		Patient patientOne=new Patient(101, "loki", "villivakkam", 85672345);
		Patient patientTwo=new Patient(102, "rahul", "redhills", 85345345);
		Patient patientThree=new Patient(103, "lochan", "nellor", 84562345);
		Patient patientOnee=new Patient(101, "korada lochan", "vellor", 2348763);

		Set<Patient> patientList=new  HashSet<>();
		patientList.add(patientOne);
		patientList.add(patientTwo);
		patientList.add(patientThree);
		
		Set<Patient> patientList2=new  HashSet<>();
		patientList2.add(patientOnee);


		Doctor docterOne=new Doctor(1001, "lokesh", "HeartPatient", patientList);
		Doctor docterTwo=new Doctor(1002, "Rahul", "ENT", patientList2);

		TreeMap<Integer, Doctor> doctorList=new TreeMap<>();
		doctorList.put(1001, docterOne);
		doctorList.put(1002, docterTwo);
		
		for (Entry<Integer, Doctor> eachDoctor : doctorList.entrySet()) {
			System.out.println("Key:"+eachDoctor.getKey());
			System.out.println("Value:"+eachDoctor.getValue());
		}

	}

}
