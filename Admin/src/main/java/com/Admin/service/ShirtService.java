package com.Admin.service;

import java.util.List;

import com.Admin.domain.Shirt;

public interface ShirtService {
	
	// define contract for save 
	Shirt save(Shirt shirt);
	
	// define contract for save 
	List<Shirt> findAll();
	
	// define contract for findOne 
	Shirt findOne(Long id);
	
	// define contract for removeOne 
	void removeOne(Long id);

}
