package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
		
		//DoctorUtils obj=ctx.getBean(DoctorUtils.class);
		//obj.create();
		//obj.findAll();
		
		
		
		
//		DoctorUtils kanna=ctx.getBean(DoctorUtils.class);
//		kanna.create();
//		ctx.close();
	}

	@Bean
	public Doctor munna() {
		Doctor doci=new Doctor();
		doci.setDoctorId(101);
		doci.setDoctorName("Munna");
		doci.setDepartment("ent");
		doci.setPhoneNumber(12345678);
		
		return doci;
	}
	
	public Doctor kanna() {
		Doctor docii=new Doctor();
		docii.setDoctorId(102);
		docii.setDoctorName("kanna");
		docii.setDepartment("heart");
		docii.setPhoneNumber(87654);
		
		return docii;
	}
	
	@Bean
	public Patient pavi() {
		return new Patient(201,"Pavithra",4567);
	}
	
	@Bean
	public Patient magi() {
		return new Patient(202,"Malathy",12345);
	}
	
	@Bean
	public Patient kavi() {
		return new Patient(203,"kavithra",6789);
	}
}
