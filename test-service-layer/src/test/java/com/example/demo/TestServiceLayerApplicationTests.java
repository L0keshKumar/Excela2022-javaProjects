package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {
	@Autowired
	CabDriverService service;

//	@Test
//	@DisplayName("find all method should return an empty array")
//	void testFinaAll() {
//		assertTrue(service.findAll().isEmpty());
//	}
	@Test
	@DisplayName("find all method should return an empty array")
	void testFinaAllSuccess() {
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName(value = "FindById method should return an element with given Id")
	void testFindById() {
		CabDriver driver=service.findById(101000).orElseThrow(EntityNotFoundException::new); 
		assertEquals("Jagadeesh", driver.getDriverName()); 
	}

}
