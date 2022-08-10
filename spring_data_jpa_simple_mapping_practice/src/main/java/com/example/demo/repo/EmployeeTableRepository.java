package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmployeeTable;

public interface EmployeeTableRepository 
			extends JpaRepository<EmployeeTable, Integer> {

	public List<EmployeeTable> findByDateOfBirth(LocalDate date);
	@Query(nativeQuery = true,
			value="SELECT * FROM LOKI_EMPLOYEE_TABLE WHERE DATE_OF_BIRTH=:DATE OR LOCATIONS=:LOC")
	public List<EmployeeTable> findByDateOfBirthAndLocation(@Param("DATE")LocalDate date,
											@Param("LOC")String location);
	
	
	
}
