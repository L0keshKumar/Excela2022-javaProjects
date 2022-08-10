package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);
		ProductRepository repo=ctx.getBean(ProductRepository.class);
		
		int val=5;
		switch (val) {
		case 1://Add
			//System.out.println("RowAdded:="+repo.add(knife()));
			break;
		case 2://FindAll
			repo.findAll().forEach(System.out::println);
					break;
		case 3://Delete
			int x=repo.deleteById(2102);
			if(x==0)
			{
				System.out.println("NOT FOUND");
			}
			else
			{
				System.out.println("DELETED SUCESSFULY");
			}
			break;
		case 4:
			System.out.println(repo.findById(501));
			break;
		case 5://Update
			int x1=repo.update(updateLaptop());
			if(x1==0)
			{
				System.out.println("NOT UPDATED");
			}
			else
			{
				System.out.println("UPDATED SUCESSFULY");
			}
			break;
			
		default:
			break;
		}
		
		
		repo.findAll().forEach(System.out::println);
		
	}
	@Bean
	public static Product knife() {
		return new Product(3456, "Knife", 3400);
		
	}
	@Bean
	public static Product updateLaptop() {
		return new Product(103,"LAPTOP",4000.0);
		
	}
}
