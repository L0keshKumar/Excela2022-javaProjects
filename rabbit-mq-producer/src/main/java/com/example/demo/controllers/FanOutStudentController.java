package com.example.demo.controllers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanOutStudentController {

	@Autowired
	private RabbitTemplate template;
	
	@PostMapping(path = "/fan/students")
	public Student addStudent(@RequestBody Student entity) {
		template.convertAndSend("rmk.ec.college","",entity);
		return entity;
		
	}
}
