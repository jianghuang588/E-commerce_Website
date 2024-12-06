package com.Admin.service;

import java.util.List;
import java.util.Set;

import com.Admin.domain.User;
import com.Admin.domain.security.UserRole;



public interface UserService {
	
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);

	// define contract for getAllUsers 
	List<User> getAllUsers();
    
	// define contract for lockUserById
    void lockUserById(Long id);
    
    // define contract for unlockUserById
    void unlockUserById(Long id); 
    
    // define contract for lockUsersByIds
    void lockUsersByIds(List<Long> userIds);
    
    // define contract for unlockUsersByIds
    void unlockUsersByIds(List<Long> userIds);
    
}

