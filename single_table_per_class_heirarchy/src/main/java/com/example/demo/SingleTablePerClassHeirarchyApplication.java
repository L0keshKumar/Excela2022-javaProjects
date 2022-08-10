package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class SingleTablePerClassHeirarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SingleTablePerClassHeirarchyApplication.class, args);
		InsuranceService service=ctx.getBean(InsuranceService.class);
		service.addPolicy();
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
