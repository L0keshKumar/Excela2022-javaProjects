package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.sql.*;
import java.time.LocalDate;

import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {

	private Connection con;
	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		int rowAdded=0;
		String sql="Insert into loki_member3 values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement prepstmt=con.prepareStatement(sql)){
			prepstmt.setInt(1, obj.getMemberId());
			prepstmt.setString(2, obj.getMemberName());
			prepstmt.setString(3, obj.getMemberAddress());
			prepstmt.setDate(4, Date.valueOf(obj.getAccountOpenDate()));
			prepstmt.setString(5, obj.getMemberShipType());
			prepstmt.setDouble(6, obj.getFeesPaid());
			prepstmt.setInt(7, obj.getMaxBooksAllowed());
			prepstmt.setDouble(8, obj.getPenaltyAmount());
			
			rowAdded=prepstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("summa");
		}
		return rowAdded;
	}

	public List<Member> findAll() {
		String sql="Select * from loki_member3";
		List<Member> membersList=new ArrayList<Member>();
		try(PreparedStatement prepstmt=con.prepareStatement(sql)){
			ResultSet rs=prepstmt.executeQuery();
			while(rs.next()) {
				
				int memberId=rs.getInt("Members_Id");
				String memberName=rs.getString("Members_name");
				String memberAddress=rs.getString("Members_Address");
				LocalDate accountOpenDate=rs.getDate("account_open_date").toLocalDate();
				String memberShipType=rs.getString("Membership_type");
				double feesPaid=rs.getDouble("fees_paid");
				int maxBooksAllowed=rs.getInt("max_books_allowed");
				double penaltyAmount=rs.getDouble("penalty_amount");
				
				Member member=new Member(memberId, memberName,
						memberAddress, accountOpenDate, memberShipType, 
						feesPaid, maxBooksAllowed, penaltyAmount);
				membersList.add(member);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return membersList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Optional<Member> findById(int id) {
		Optional<Member> re = Optional.empty();
		String sql="Select * from loki_member3 where Members_Id=?";
		try(PreparedStatement prepstmt=con.prepareStatement(sql)){
			
			prepstmt.setInt(1,id);
			ResultSet rs=prepstmt.executeQuery();
			if(rs.next()) {
				int memberId=rs.getInt("Members_Id");
				String memberName=rs.getString("Members_name");
				String memberAddress=rs.getString("Members_Address");
				LocalDate accountOpenDate=rs.getDate("account_open_date").toLocalDate();
				String memberShipType=rs.getString("Membership_type");
				double feesPaid=rs.getDouble("fees_paid");
				int maxBooksAllowed=rs.getInt("max_books_allowed");
				double penaltyAmount=rs.getDouble("penalty_amount");
				Member obj=new Member(memberId, memberName, memberAddress, accountOpenDate, memberShipType, feesPaid, maxBooksAllowed, penaltyAmount);
				re=Optional.of(obj);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return re;
	}

	public int update(int Id, Member member) {

		return 0;
	}
public void usingTxnt(Product product1,Product product2) {
		
		String sql="insert into loki_product values(?,?,?)";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql);
				){
			con.setAutoCommit(false);
			pstmt.setInt(1, product1.getProductId());
			pstmt.setString(2, product1.getProductName());
			pstmt.setDouble(3, product1.getPrice());
			
			int rowAdded=pstmt.executeUpdate();
			System.out.println("ROW ADDES:="+rowAdded);
			
			//con.setAutoCommit(false);
			pstmt.setInt(1, product2.getProductId());
			pstmt.setString(2, product2.getProductName());
			pstmt.setDouble(3, product2.getPrice());
			int rowAdded2=pstmt.executeUpdate();
			
			if(product2.getPrice()>product1.getPrice()) {
				con.commit();
			}
			else
			{
				con.rollback();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
public void usingTxntWithCatch(Product product1,Invoice product2) {
	String addProductsql="insert into loki_product values(?,?,?)";
	String sql="insert into loki_invoice values(?,?,?,?)";
	
	try(PreparedStatement pstmt=con.prepareStatement(addProductsql);
			PreparedStatement invoicepstmt=con.prepareStatement(sql)
			){
		con.setAutoCommit(false);
		invoicepstmt.setInt(1, product1.getProductId());
		invoicepstmt.setString(2, product1.getProductName());
		invoicepstmt.setDouble(3, product1.getPrice());
		
		int rowAdded=invoicepstmt.executeUpdate();
		
		pstmt.setInt(1, product2.getInvoiceNumber());
		pstmt.setString(2, product2.getCustomerName());
		pstmt.setInt(3,product2.getQuantity());
		pstmt.setInt(4, product2.getProductRef());
		
		int rowAdded2=pstmt.executeUpdate();
		System.out.println("ROW ADDED:="+rowAdded+" : "+rowAdded2);
		con.commit();
	}catch(SQLException e){
		e.printStackTrace();
		try {
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}

}
