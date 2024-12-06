package com.ClothStore.service;

import com.ClothStore.domain.UserPayment;


public interface UserPaymentService {
	
	// define contract to get the find specific id for payment information 
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
