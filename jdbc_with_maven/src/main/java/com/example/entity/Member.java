package com.example.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Member {

	private int memberId;
	private String memberName;
	private String memberAddress;
	private LocalDate accountOpenDate;
	private String memberShipType;
	private double feesPaid;
	private int maxBooksAllowed;
	private double penaltyAmount;
	
	
	public Member(int memberId, String memberName, String memberAddress, LocalDate accountOpenDate2,
			String memberShipType, double feesPaid, int maxBooksAllowed, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accountOpenDate = accountOpenDate2;
		this.memberShipType = memberShipType;
		this.feesPaid = feesPaid;
		this.maxBooksAllowed = maxBooksAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getMaxBooksAllowed() {
		return maxBooksAllowed;
	}
	public void setMaxBooksAllowed(int maxBooksAllowed) {
		this.maxBooksAllowed = maxBooksAllowed;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accountOpenDate=" + accountOpenDate + ", memberShipType=" + memberShipType + ", feesPaid="
				+ feesPaid + ", maxBooksAllowed=" + maxBooksAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	
	
}
