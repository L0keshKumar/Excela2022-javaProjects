package com.training.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.training.ifaces.EmployeeRepository;
import com.training.model.Employee;
import com.training.service.EmployeeService;
@ExtendWith(MockitoExtension.class)
public class TestEmployee {

	@Mock
	EmployeeRepository repo;
	
	@InjectMocks
	EmployeeService service;
	
	@Test
	@DisplayName(value = "Test the value is not found should return ElementNotFound")
	void testElementFound() throws Exception {
		
		Employee rev = new Employee(101, "revathy");
		Mockito.when(repo.getById(102)).thenReturn(Optional.of(rev));
		//assertNotNull(service.getById(101));
		assertEquals(rev, service.getById(102));
		//System.out.println( "poda:"+service.getById(102));
		
		
	}
	
	@Test
	@DisplayName(value = "test the value delete the id if found otherwise throws exception")
	void testDeleteById() {
		Employee rev = new Employee(101, "revathy");
		Mockito.when(repo.deleteById(101)).thenReturn(Optional.of(rev));
		assertNotNull(service.deleteById(101));
		
		
	}
	@Test
	@DisplayName(value = "throwing exception")
	void isThrowException() {
		Employee rev = new Employee(101, "revathy");
		Mockito.when(repo.getById(anyInt())).thenThrow(RuntimeException.class);
		assertThrows(RuntimeException.class, ()->service.getById(101));
	}
	


}
