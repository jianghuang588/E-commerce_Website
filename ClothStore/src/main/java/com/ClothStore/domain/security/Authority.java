package com.ClothStore.domain.security;

import org.springframework.security.core.GrantedAuthority;



public class Authority implements GrantedAuthority {
	
	
private final String control;
	
	public Authority(String control) {
		this.control = control;
	}
	
	@Override
	public String getAuthority() {
		return control;
	}
	
}

