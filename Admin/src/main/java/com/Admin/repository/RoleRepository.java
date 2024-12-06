package com.Admin.repository;

import org.springframework.data.repository.CrudRepository;

import com.Admin.domain.security.Role;



public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByname(String name);
}
