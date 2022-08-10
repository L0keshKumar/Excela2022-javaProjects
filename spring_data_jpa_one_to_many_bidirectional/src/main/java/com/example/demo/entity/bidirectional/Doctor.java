package com.example.demo.entity.bidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="loki_doc_otmbd2")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

	@Id //primary key
	@Column(name = "doctor_id")
	int doctorId;
	
	@Column(name = "doctor_name")
	String doctorName;
	
	@Column(name = "department")
	String department;
	
	@Column(name = "phone_number")
	long phoneNumber;
	
	@OneToMany(mappedBy = "doctor",
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL)
	//BIDIRECTIONAL
	List<Patient> patientList;//One to Many : 
	//One doctor have many Patients;

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	
	
	
	
	
	}

