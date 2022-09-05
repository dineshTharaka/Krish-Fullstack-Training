package com.krishantha.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl() {

	}

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("overloaded constructor executed	");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("System injection fired");
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();

	}

}
