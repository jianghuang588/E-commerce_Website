package com.ClothStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClothStore.domain.UserShipping;
import com.ClothStore.repository.UserShippingRepository;
import com.ClothStore.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	
	@Autowired
	private UserShippingRepository userShippingDataRepository;
	
	
	public UserShipping findById(Long identity) {
		// call the repository method of findById 
		return userShippingDataRepository.findById(identity).orElse(null);
	}
	
	
	public void removeById(Long identity) {
		// call the repository method of deleteById 
		userShippingDataRepository.deleteById(identity);
	}
}
