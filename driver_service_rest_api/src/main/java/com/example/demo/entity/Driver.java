package com.example.demo.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;


@Data
@Entity
@Table(name="loki_driver")
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	
		@Id
		@Column(name = "id")
		private int driverId;
		
		@Column(name = "driver_name")
		private String driverName;
		
		@Column(name = "Mobile_number")
		private long mobileNumber;
		
		private double rating;
	    

	    

}