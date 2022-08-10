package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "loki_health_insurance")
@PrimaryKeyJoinColumn(name = "id",
						referencedColumnName = "policy_number")	
public class HealthInsurance extends Insurance{

	private int age;
	
	private String status;
	
	public HealthInsurance(int policyNumber, String policyHolderName, int age, String status) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.status = status;
	}
	
}
