package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="loki_employee_table")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTable {

	@Id
	@Column(name = "employee_id")
	int employeeId;
	
	@Column(name = "employee_name")
	String employeeName;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	@Column(name = "date_of_birth")
	LocalDate dateOfBirth;
	
	@Column(name = "locations")
	String location;
	
	@Column(name = "skill_set")
	String skillSet;
	
	@Column(name = "phone_number")
	long phoneNumber;
	
}
