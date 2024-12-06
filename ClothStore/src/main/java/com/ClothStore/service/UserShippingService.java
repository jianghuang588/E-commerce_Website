package com.ClothStore.service;

import com.ClothStore.domain.UserShipping;

public interface UserShippingService {
	
	// define contract to find id for usershipping 
	UserShipping findById(Long id);
	
	// define contract to delete id for usershipping 
	void removeById(Long id);

}
