package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="loki_patient_OneToMany")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

	@Id //primary key
	@Column(name = "patient_id")
	int patientId;
	
	@Column(name = "patient_name")
	String patientName;
	
	@Column(name = "mobile_number")
	long mobileNumber;
}
