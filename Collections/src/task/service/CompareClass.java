package task.service;

import java.util.Comparator;

import Collectiontask.Patient;

public class CompareClass implements Comparator<Patient> {

	@Override
	public int compare(Patient arg0, Patient arg1) {
		//compareToIgnoreCase can ignore the case but not the integers used
		return arg0.getPatientName()
				.compareToIgnoreCase(arg1.getPatientName());
	}
	public static int CompareById(Patient arg0, Patient arg1) {
//		if(arg0.getPatientId()>arg1.getPatientId())return 1;
//		if(arg0.getPatientId()<arg1.getPatientId())return -1;
//		return 0;
		return arg0.getPatientName()
				.compareToIgnoreCase(arg1.getPatientName());
	}

}
