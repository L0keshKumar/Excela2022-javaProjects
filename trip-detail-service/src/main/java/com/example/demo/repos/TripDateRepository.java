package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TripDetails;

public interface TripDateRepository extends JpaRepository<TripDetails, Integer> {
	
	List<TripDetails> findByDriverId(Integer id);
}
