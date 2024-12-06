package com.ClothStore.utility;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/*
 	- udemy section3 part17: https://www.udemy.com/course/complete-e-commerce-course-javaspringhibernate-and-mysql/learn/lecture/6363164#questions
 */
@Component 
public class SecurityUtility {
	private static final String SALT = "salt";
		
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));

	}
	
	@Bean
	public static String randomPassword() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		
		while (salt.length() < 18) {
			int index = (int) (rnd.nextFloat()*SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		
		String saltStr = salt.toString();
		return saltStr;
	}
	
}
