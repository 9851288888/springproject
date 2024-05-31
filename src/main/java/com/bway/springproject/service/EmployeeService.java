package com.bway.springproject.service;

import java.util.List;

import com.bway.springproject.model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
	
	void deleteEmployee(Integer empId);
	
	void updateEmployee(Employee empployee);
	
	Employee getEmployeeById(Integer empId);
	
	List<Employee> getAllEmployees();
	

}
