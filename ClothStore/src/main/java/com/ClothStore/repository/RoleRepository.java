package com.ClothStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ClothStore.domain.security.Role;


public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByname(String name);
}
