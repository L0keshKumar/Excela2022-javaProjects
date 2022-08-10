package com.example.demo.controllers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.direct.config.TopicExchangeConfig;
/**
 * 
 * @author LokeshKumar.A
 *
 */
@RestController
public class TopicController {

	@Autowired
	@Qualifier("Topic")
	private RabbitTemplate template;
	
	@PostMapping(path = "/topic/Students")
	public String addStudent(@RequestBody Student entity) {
		String routKey="award.ece.2022";
		if(entity.getStudentId()>200) {
			routKey="award.cse.2022";
		}
		template.convertAndSend(TopicExchangeConfig.EXCHANGE_NAME,routKey,entity);
		return "One Student Added";
	}
}
