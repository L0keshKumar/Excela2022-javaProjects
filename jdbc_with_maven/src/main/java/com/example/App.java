package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

import org.omg.IOP.CodecFactory;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductService;
import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */

public class App 
{
	public static void members() {
	//System.out.println( "Hello World!" );
    Connection con = null;

//		con = DriverManager.getConnection
//			("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//		MemberRepository memberRepository=new MemberRepository(con);
		
		
		//memberRepository.findAll().forEach(System.out::println);
		
//Using Connection Factory this may not return sql exception so it may not handle by try,catch
//		con=ConnectionFactory.getOracleConnection();
//		System.out.println(con);
		
		//MemberRepository memberRepository=new MemberRepository(con);
//		Optional<Member> found=memberRepository.findById(2);
//		if(found.isPresent()) {
//			System.out.println("FOUND:="+found.get());
//		}
//		else {
//			System.out.println("PRODUCT NOT AVAILABLE");
//		}
//		

		
		
		
		
		con=ConnectionFactory.getOracleConnection();
		MemberRepository memberRepository=new MemberRepository(con);
		
		//System.out.println(con);
//		Member mem=new Member(111, "harti", "chennai",
//				LocalDate.of(2001, 07, 21),
//				"Annual", 200.0, 3, 20.0);
//		System.out.println(memberRepository.add(mem));
		Product toyota=new Product(2102,"toyota",450.0);
		Invoice invoicetoyota=new Invoice(1011, "nuthu", 3, 2102);
		
		memberRepository.usingTxntWithCatch(toyota, invoicetoyota);

}
	public static void product() {
		Connection con=ConnectionFactory.getPostgressConnection();
		
			ProductService service= new ProductService(con);
			
			
			
			
//			Product kathli=new Product(2102,"moti chor laddu",450.0);
//			Product jamun=new Product(3102, "badam jamun", 200.0);
//			service.usingTxnt(kathli, jamun);
			
//			Product toAdd= new Product(103,"UPS",5000.0);
//			int rowAdded=service.addProduct(toAdd);
//			System.out.println("ROW ADDED:-"+rowAdded);
			
			
//			int rowsDeleted=service.deletById(101);
//			System.out.println("ROWS DELETED:-"+rowsDeleted);
//			service.findAll().forEach(System.out::println);
			
//			Optional<Product> found=service.findById(108);
//			if(found.isPresent()) {
//				System.out.println("FOUND:="+found.get());
//			}
//			else {
//				System.out.println("PRODUCT NOT AVAILABLE");
//			}
			
//			int rowsUpdated=service.updatePriceByName("UPS", 10000);
//			System.out.println("ROWS UPDATED:="+rowsUpdated);
//			System.out.println("----------");
			service.findAll().forEach(System.out::println);
			
	}
    public static void main( String[] args )
    {
        //product();
		members();
			
    }
}
