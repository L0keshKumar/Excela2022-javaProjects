package com.example.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ifaces.CrudRepository;

public class LoanService implements CrudRepository<LoanApplication> {

	private Connection con;

	public LoanService(Connection con) {
		super();
		this.con = con;
	}

	public List<LoanApplication> findAll() {
		List<LoanApplication> loanList=new ArrayList<LoanApplication>();
		String sql="SELECT CUST.CUSTOMER_ID,cust.customer_name,cust.credit_score,loanapp.application_number,loanapp.loan_amount FROM LOKI_CUSTOMER CUST left outer join LOKI_LOAN_APPLICATION LOANAPP ON cust.customer_id=LOANAPP.CUSTOMER_REF";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				
				int customerId=rs.getInt("customer_id");
				String customerName=rs.getString(2);
				double creditScore=rs.getDouble(3);
				int applicationNumber=rs.getInt(4);
				double loanAmount=rs.getDouble(5);
				
			Customer customer=new Customer(customerId, customerName, 0, creditScore);
				LoanApplication prod=new LoanApplication(applicationNumber, customer, loanAmount);
				loanList.add(prod);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return loanList;
		
	}

	public int remove(int id) {
		
		return 0;
	}

	public Optional<LoanApplication> findById(int id) {
		Optional<LoanApplication> opt=Optional.empty();
		String sql="SELECT CUST.CUSTOMER_ID,cust.customer_name,cust.phone_number,cust.credit_score,loanapp.application_number,loanapp.loan_amount FROM LOKI_CUSTOMER CUST left outer join LOKI_LOAN_APPLICATION LOANAPP ON cust.customer_id=LOANAPP.CUSTOMER_REF WHERE CUST.CUSTOMER_ID=?";
		//String sql="select * from LOKI_CUSTOMER CUST left outer join LOKI_LOAN_APPLICATION LOANAPP ON cust.customer_id=LOANAPP.CUSTOMER_REF where cust.customer_id=?;";

		try(PreparedStatement prepstmt=con.prepareStatement(sql)){
			prepstmt.setInt(1, id);
			ResultSet rs=prepstmt.executeQuery();
			if(rs.next()) {
				int customerId=rs.getInt(1);
				String customerName=rs.getString(2);
				long phoneNumber=rs.getLong(3);
				double creditScore=rs.getDouble(4);
				int applicationNumber=rs.getInt(5);
				double loanAmount=rs.getDouble(6);
				Customer customer=new Customer(customerId, customerName, phoneNumber, creditScore);
				LoanApplication loan=new LoanApplication(applicationNumber, customer, loanAmount);
				opt=Optional.of(loan);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Matikita pangu");
		}
		return opt;
	}

	public int update(int Id, LoanApplication member) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int add(LoanApplication obj) {
//		int rowAdded=0;
//		String sql="Insert into loki_member3 values(?,?,?,?,?,?,?,?)";
//		try(PreparedStatement prepstmt=con.prepareStatement(sql)){
//			//prepstmt.setInt();
//			
//			
//			rowAdded=prepstmt.executeUpdate();
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//			System.out.println("summa");
//		}
//		return rowAdded;
//		
//	}
public int add(LoanApplication obj) {
	int rowAdded = 0;
	String sql = "insert into LOKI_LOAN_APPLICATION values(?,?,?)";
	String sql2="insert into loki_customer values(?,?,?,?)";
	try(PreparedStatement pstmt=con.prepareStatement(sql);
			PreparedStatement pstmt2=con.prepareStatement(sql2))
	{
				pstmt2.setInt(1, obj.getCustomer().getCustomerId());
				pstmt2.setString(2, obj.getCustomer().getCustomerName());
				pstmt2.setLong(3, obj.getCustomer().getPhoneNumber());
				pstmt2.setDouble(4, obj.getCustomer().getCreditScore());
				
				pstmt.setInt(1, obj.getApplicationNumber());
				pstmt.setInt(2, obj.getCustomer().getCustomerId());
				pstmt.setDouble(3, obj.getLoanAmount());
				
				pstmt2.executeUpdate();
				rowAdded=pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();		
		}
	return rowAdded;
	}

}
