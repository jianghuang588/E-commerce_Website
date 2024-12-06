package com.Admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Admin.domain.User;


	
public interface UserRepository extends CrudRepository<User, Long>{
	
	
	User findByUsername(String username);	
	
	// select * from user
    List<User> findAll();
}

