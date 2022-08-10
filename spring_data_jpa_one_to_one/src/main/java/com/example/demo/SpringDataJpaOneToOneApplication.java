package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOneToOneApplication.class, args);
		SeminarUtils semi=ctx.getBean(SeminarUtils.class);
		semi.create();
		semi.findAll();
		ctx.close();
	}
	@Bean
	public Seminar life() {
		Seminar laip=new Seminar();
		laip.setId(101);
		laip.setName("kalaivanar arangam");
		laip.setDuration(10);
		return laip;
		
	}
	@Bean
	public Speaker lokesh() {
		return new Speaker(201, "lokesh", "SSLC");
	}
}
