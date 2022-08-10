package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirectional.Utility;

@SpringBootApplication
public class SpringDataJpaOneToManyBidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOneToManyBidirectionalApplication.class, args);
		Utility obj= ctx.getBean(Utility.class);
		try {
			int key=3;
			switch (key) {
			case 1:
				obj.create();
				break;
			case 2:
				obj.findAll();
				break;
			case 3:
				obj.findDoctorFromPatient();
				break;
			case 4:
				
				break;
			default:
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//obj.create();
		//obj.findDoctorFromPatient();
		finally {
			ctx.close();
		}
		
	}
	@Bean
	public Doctor loki() {
		Doctor docii=new Doctor();
		docii.setDoctorId(101);
		docii.setDoctorName("loki");
		docii.setDepartment("kidny");
		docii.setPhoneNumber(87654);
		
		return docii;
	}
	
	@Bean
	public Patient sthhiya() {
		return new Patient(204,"sthhiya",4567);
	}
	
	@Bean
	public Patient yovel() {
		return new Patient(205,"yovel",12345);
	}
	
	@Bean
	public Patient raj() {
		return new Patient(206,"raj",6789);
	}

}
