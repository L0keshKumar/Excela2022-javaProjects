package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.mockito.BDDMockito.*;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest {

	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver lokesh;
	private CabDriver lochan;
	private CabDriver rahul;
	@BeforeAll
	void init() {
		lokesh=new CabDriver(303, "lokesh", 987654321, "chennai", LocalDate.of(2001, 07, 21), 4.5);
		lochan=new CabDriver(304, "lochan", 765432198, "Nellor", LocalDate.of(2000, 03, 14), 4.2);
		rahul=new CabDriver(305, "rahul", 543219876, "Madras", LocalDate.of(2000, 06, 12), 5);
	}
	
	@DisplayName(value = "Test findAll Method return a array")
	@Test
	void testFindAll() throws Exception {
		List<CabDriver> driverList=Arrays.asList(lokesh,lochan,rahul);
		
		given(service.findAll()).willReturn(driverList);
		
		mock.perform(MockMvcRequestBuilders
                .get("/api/v1/drivers")
               .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[0].driverName", is("lokesh")));

	}
	@Test
	@DisplayName("Test Add Method return status code 201 and return the element Added")
	void testAdd() throws Exception{
		
		CabDriver prawin = new CabDriver(605, "Prawin", 9876541234L, "Madurai", 
				LocalDate.of(1998, 10, 12), 4.8);
		
		given(service.save(prawin)).willReturn(prawin);
		 
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
	               .contentType(MediaType.APPLICATION_JSON)
	               .content(asJsonString(prawin)))
	     		   .andExpect(status().isCreated())
	     		   .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	     		   .andExpect(jsonPath("$.driverName", is("Prawin")));   
	}

	private String asJsonString(CabDriver driver) {
		try {
			//ObjectMapper objectMapper = new ObjectMapper();
			return mapper.writeValueAsString(driver);
			} catch(Exception e) {
			throw new RuntimeException(e);
			}
	}
}
