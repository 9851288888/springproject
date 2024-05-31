package com.bway.springproject.service;

import java.util.List;

import com.bway.springproject.model.Department;

public interface DepartmentService {
	
	
	void addDept(Department dept);
	
	void deleteDept(int id);
	
	void updateDepat(Department dept);
	
	Department getDeptById(int id);
	
	List<Department> getAllDepts();

	//void viewDepat(Department dept);

}
