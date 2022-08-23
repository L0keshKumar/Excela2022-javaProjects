package Collectiontask;

import java.util.*;

public class Doctor {
	private long doctorId;
	private String doctorName;
	private String department;
	private Set<Patient> patientList;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(long doctorId, String doctorName, String department, Set<Patient> patientList) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.patientList = patientList;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Set<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", patientList=" + patientList + "]";
	}
	
	
	
}
