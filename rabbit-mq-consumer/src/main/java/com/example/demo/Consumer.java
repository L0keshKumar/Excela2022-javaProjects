package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.direct.config.DirectExchangeConfig;

@Component
public class Consumer {

//	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
//	public void consumeMessage(String message) {
//		
//		System.out.println("Received One Message:= "+message);
//	}
	
	@RabbitListener(queues = "rmk.cse.student")
	public void consumeMessage1(String message) {
		
		System.out.println("Received One Message:= "+message);
	}
	
	@RabbitListener(queues = "rmk.ece.student")
	public void consumeMessage2(String message) {
		
		System.out.println("Received One Message:= "+message);
	}
}
