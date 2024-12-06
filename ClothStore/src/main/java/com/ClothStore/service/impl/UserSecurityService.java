package com.ClothStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ClothStore.domain.User;
import com.ClothStore.repository.UserRepository;


// UserDetailsService is the interface that provide certain method like loadUserByUsername to check if user exit
// UserDetailsService is use to load user username and password from mysql database.


@Service
public class UserSecurityService implements UserDetailsService{
	
	
	@Autowired
	private UserRepository customerRepository;
	
	// check if user exit 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User client = customerRepository.findByUsername(username);
		
		if(null == client) {
			throw new UsernameNotFoundException("Client not found");
		}
		
		return client;
	}
}
