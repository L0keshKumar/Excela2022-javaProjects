package task.service;
import java.util.*;

import Collectiontask.Doctor;
import Collectiontask.Patient;
public class Appointment {
	private HashMap<Doctor, Set<Patient>> apointmentList;
	
	public Appointment() {
		super();
		apointmentList=new HashMap<Doctor, Set<Patient>>();
	}

	public Appointment(HashMap<Doctor, Set<Patient>> apointmentList) {
		super();
		this.apointmentList = apointmentList;
	}

	public HashMap<Doctor, Set<Patient>> getApointmentList() {
		return apointmentList;
	}

	public void setApointmentList(HashMap<Doctor, Set<Patient>> apointmentList) {
		this.apointmentList = apointmentList;
	}
	public Set<Patient> getPatients(Doctor key){
		return this.apointmentList.get(key);
		}
}
