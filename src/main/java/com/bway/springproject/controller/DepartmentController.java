package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springproject.model.Department;
import com.bway.springproject.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/department")
	public String getDepartment() {
		
		return "Departmentform";
	}
	
	@PostMapping("/department")
	public String postDepartment(@ModelAttribute Department dept) {
		deptService.addDept(dept);
			
		return "Departmentform";
	}
	@GetMapping("/departmentList")
	public String getAll(Model model) {
		
		model.addAttribute("dlist",deptService.getAllDepts());
		System.out.println("==========size=="+deptService.getAllDepts());
		
		return "Department_list_form";
	}
	@GetMapping("/dept/delete")
	public String delete(@RequestParam int id) {
		
		deptService.deleteDept(id);
		
		return "redirect:/DepartmentList";
	}
	@GetMapping("/dept/edit")
	public String edit (@RequestParam int id, Model model) {
		model.addAttribute("dModel",deptService.getDeptById(id));
		return "DepartmentEditForm";
		
	}
	@PostMapping("/dept/update")
	public String update(@ModelAttribute Department dept) {
	deptService.updateDepat(dept);
	return "redirect:/departmentList";
	
	}
//	@PostMapping("/dept/view")
//	public String view(@ModelAttribute Department dept) {
//	deptService.viewDepat(dept);
//	return "redirect:/departmentList";
//	}
}

