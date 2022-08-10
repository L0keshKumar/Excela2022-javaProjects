package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class TablePerSubClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.
				run(TablePerSubClassApplication.class, args);
		InsuranceService service=ctx.getBean(InsuranceService.class);
		try {
			int key=2;
			switch (key) {
			case 1:
//				service.addHealthPolicy();
//				service.addLifePolicy();
				break;
			case 2:
				service.getHealthPolicy();
				break;
			case 3:
				service.getLifePolicy();
			default:
				break;
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ctx.close();
		}
		
	}

	@Bean
	public LifeInsurance life() {
		return new LifeInsurance(101, "ragesh", 23, "it service");
		
	}
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(501, "Manish", 565, "diabetic");
	}
}
