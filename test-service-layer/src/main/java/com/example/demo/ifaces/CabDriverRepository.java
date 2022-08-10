package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.CabDriver;

public interface CabDriverRepository extends CrudRepository<CabDriver, Integer> {
	
	CabDriver findByDriverName(String qryName);

}
