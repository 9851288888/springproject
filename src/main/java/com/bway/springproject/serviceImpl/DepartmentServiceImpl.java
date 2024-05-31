package com.bway.springproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springproject.model.Department;
import com.bway.springproject.repository.DepertmentRepository;
import com.bway.springproject.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepertmentRepository deptRepo;

	@Override
	public void addDept(Department dept) {
		deptRepo.save(dept);
	}

	@Override
	public void deleteDept(int id) {
		deptRepo.deleteById(id);

	}

	@Override
	public void updateDepat(Department dept) {
		deptRepo.save(dept);

	}

	@Override
	public Department getDeptById(int id) {

		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> getAllDepts() {

		return deptRepo.findAll();
	}

//	@Override
//	public void viewDepat(Department dept) {
//		// TODO Auto-generated method stub
		
	}


