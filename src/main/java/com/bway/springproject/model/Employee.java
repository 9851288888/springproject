package com.bway.springproject.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employee_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String gender;
	@DateTimeFormat(iso = ISO.DATE)
	private String dob;
		
	private String phone;
	private String email;
	private String companyName;
	private String post;
	private int salary;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate joinDate;
	
	@JoinColumn(name = "addressId")
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@ManyToMany
	private List<Department> departments;
	
	@CollectionTable
	@ElementCollection 
	private List<String> projects;
	

}
