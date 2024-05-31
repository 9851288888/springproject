package com.bway.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springproject.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>{
	//for user login
	User findByUsernameAndPassword(String un, String psw);
	
	//check if user already exist
	User findByUsername(String un);
}
