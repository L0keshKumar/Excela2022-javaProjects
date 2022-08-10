package com.example.demo.utils.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.*;
import com.example.demo.ifaces.bidirectional.*;;
@Component
public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository doctorRepo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		
		Doctor added=doctorRepo.save(doc);
		for(Patient eachPatient:patientList) {
			eachPatient.setDoctor(doc);
			patientRepo.save(eachPatient);
		}
		//doc.setPatientList(patientList);
		
		if(added!=null) {
			System.out.println("One Record Added");
		}
	}
public void findAll() {
		
		List<Doctor> doctors = doctorRepo.findAll();
//		doctors.forEach(System.out::println);
		for(Doctor eachDoctor:doctors) {
			
			System.out.println("Doctor Name:=" +eachDoctor.getDoctorName());
			System.out.println("Department:= "+eachDoctor.getDepartment());
			
			List<Patient> patients = eachDoctor.getPatientList();
			
			for(Patient eachPatient:patients) {
				
				System.out.println("Patient Name:= "+eachPatient.getPatientName());
				System.out.println("Monbile Number:="+eachPatient.getMobileNumber());
			}
		}
	}
	public void findDoctorFromPatient() {
		Patient entity=patientRepo.findById(204).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}
	
	
}
