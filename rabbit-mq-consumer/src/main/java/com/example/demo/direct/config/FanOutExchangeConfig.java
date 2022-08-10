package com.example.demo.direct.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanOutExchangeConfig {

	@Bean
	public Queue fanOutQueue1() {
		return new Queue("rmk.csc.student",false);
	}
	
	@Bean
	public Queue fanOutQueue2() {
		return new Queue("rmk.ece.student",false);
	}
	
	@Bean
	public FanoutExchange exchange() {
		return new FanoutExchange("rkm.ec.college");
	}
	@Bean
    public Binding bindingDirect1(FanoutExchange exchange,@Qualifier("fanOutQueue1") Queue FanoutQueue1) {
   
    	return  BindingBuilder.bind(FanoutQueue1).to(exchange);
    }
	
	@Bean
    public Binding bindingDirect2(FanoutExchange exchange,@Qualifier("fanOutQueue2") Queue FanoutQueue2) {
   
    	return  BindingBuilder.bind(FanoutQueue2).to(exchange);
    }
	
	

}
