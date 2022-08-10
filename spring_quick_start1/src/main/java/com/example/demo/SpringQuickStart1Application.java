package com.example.demo;
import org.training.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Teacher;


@SpringBootApplication
@ComponentScan(basePackages= {"org.training","com.example"})
public class SpringQuickStart1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication
				.run(SpringQuickStart1Application.class, args);
		/*Primary source ->SpringQuickStart1Application.class
		 * a java class annotated with @SpringBootApplication
		 * is called primary source*/
		
		
		System.out.println(ctx.getBean(Book.class));
		System.out.println("author:="+ctx.getBean("java",Author.class));
		
		
		Invoice invoi=ctx.getBean(Invoice.class);
		
		System.out.println(invoi);
		
		Bill bill=ctx.getBean(Bill.class);
		System.out.println("Customer="+bill.getCustomer());
		System.out.println("Product="+bill.getProduct());
		
		CustomerList list=ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
	}
	
	@Bean
	public static Author java() {
		return new Author(5678, "kiju");
	}
	@Bean
	@Primary
	public static Author mani() {
		return new Author(5678, "mani");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void testOne(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringQuickStart1Application.class, args);
		//System.out.println(ctx.getBean("ram"));
		
		System.out.println(ctx.getBean("harish"));
		
		
		
		//When using id Need to cast to specific bean since
		//return type of get bean Method is Object
		Teacher teacher1=(Teacher) ctx.getBean("harish");
		
		
		
		//when more than one bean of same type available
		//should use id and class name
		Teacher teacher2=ctx.getBean("harish",Teacher.class);
		
		//casting not required , but there should be only one bean of that type
		//will throw exception
		//Teacher teacher3=ctx.getBean(Teacher.class);
		
		
		
		System.out.println(teacher1);
		System.out.println(teacher2);
		//System.out.println(teacher3);
//Teacher stella=ctx.getBean(Teacher.class);
//		stella.setId(201);
//		stella.setName("Stella");
//		stella.setSubject("English");
//		
//		System.out.println(stella);
	}
	

}
