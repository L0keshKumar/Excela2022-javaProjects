package com.training;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.example.model.Customer;
import com.example.model.LoanApplication;
import com.example.model.LoanService;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			System.out.println(con);
			LoanService service=new LoanService(con);
//			service.findAll().forEach(System.out::println);
			System.out.println("/////find bb id ////");
			Optional<LoanApplication>opt=service.findById(101);
			if(opt.isPresent()) {
				System.out.println(opt.get());
			}
			else
			{
				System.out.println("ID is NOT Found");
			}
			System.out.println("///row added////");
			Customer cust=new Customer(104, "lochan", 1236789, 600);
			LoanApplication loanApp=new LoanApplication(1003, cust, 4000.0);
			int rowAdded=service.add(loanApp);
			System.out.println(rowAdded);
			service.findAll().forEach(System.out::println);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
