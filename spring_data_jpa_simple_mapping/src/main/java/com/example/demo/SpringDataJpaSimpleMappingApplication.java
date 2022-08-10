package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		//Doctor siva = ctx.getBean(Doctor.class);
		
		DoctorService service = ctx.getBean(DoctorService.class);
		
//		Doctor added = service.add(siva);
//		
//		if(added!=null) {
//			System.out.println("One Doctor added");
//		}
		service.findAll().forEach(System.out::println);
		System.out.println("--------------------------------");
		List<Doctor> entDr=service.findByDept("ENT");
		entDr.forEach(System.out::println);
		System.out.println("-------------------");
		
		Doctor drKamal=service.findByDoctorName("kamal");
		System.out.println(drKamal);
		System.out.println("-------------------------------------");
		
		List<Doctor> dtr=service.findByDoctorNameAndDepartment("sivaji", "ENT");
		dtr.forEach(System.out::println);
		System.out.println("---------------------------------------");
		
		List<Doctor> queryDtr=service.getByNameDept("rajini", "heart");
		queryDtr.forEach(System.out::println);
		ctx.close();
	}

//	@Bean
//	public Doctor siva() {
//		return new Doctor(101, "sivaji", "ENT", 987654321);
//	}
	
}
