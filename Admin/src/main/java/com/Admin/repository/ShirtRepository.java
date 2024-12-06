package com.Admin.repository;


import org.springframework.data.repository.CrudRepository;

import com.Admin.domain.Shirt;

public interface ShirtRepository extends CrudRepository<Shirt, Long>{
	
	
}
