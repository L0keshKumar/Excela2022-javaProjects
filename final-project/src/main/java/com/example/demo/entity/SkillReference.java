package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loki_fp_skill_reference")
public class SkillReference {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	int employeeId;
	
	@Column(name = "skill_type")
	String skillType;
	
	@Column(name = "skill_name")
	String skillName;
	
	@Column(name = "created_date")
	LocalDate createdDate;
	
	@Column(name = "created_by")
	String createdBy;
	
	@Column(name = "created_time")
	@DateTimeFormat(iso = ISO.TIME)
	LocalTime createdTime;
}
