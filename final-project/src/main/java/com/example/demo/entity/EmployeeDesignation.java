package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "loki_fp_emp_designation")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDesignation {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_desg_id")
	int employeeDesignationId;
	
	@Column(name = "emp_desg")
	String employeeDesignation;
}
