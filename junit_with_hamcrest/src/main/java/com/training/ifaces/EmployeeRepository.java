package com.training.ifaces;

import java.util.List;
import java.util.Optional;

import com.training.model.Employee;

public interface EmployeeRepository {

	public Employee add(Employee entity);
	public Optional<Employee> getById(int id);
	public Optional<Employee> deleteById(int id);
}
