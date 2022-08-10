package com.example;
import java.util.*;
import java.util.Date;
import java.sql.*;
import java.time.*;
public class WorkingWithDifferentDataClasses {

	public static void main(String[] args) {

		java.util.Date date1=new java.util.Date();
		java.sql.Date date2=new java.sql.Date
				(date1.getTime());
		//syso(date1.getTime) 102030338482
		//Util Date to SQL Date
		System.out.println("Util format:-"+date1);
		System.out.println("Sql Format:-"+date2+
				"\nrealaFormat:-"+date1.getTime());
		
		
		//SQL Date To LocalDate
		LocalDate localDate=date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		
		java.sql.Date sqlDate2=
				java.sql.Date.valueOf(localDate);
		System.out.println("SQL DATE 2:"+sqlDate2);
	}

}
