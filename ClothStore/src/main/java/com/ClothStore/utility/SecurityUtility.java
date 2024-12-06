package com.ClothStore.utility;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


@Component 
public class SecurityUtility {
	private static final String SALT = "salt";
		
	
	// convert password to unreadable string 
	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));

	}
	
	// generate password random from SALT_ALPHABET that the length is less than 18
	@Bean
	public static String randomPassword() {
		String SALT_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
				StringBuilder saltToken = new StringBuilder();
		Random random = new Random();
		
		while (saltToken.length() < 18) {
			int index = (int) (random.nextFloat()*SALT_ALPHABET.length());
			saltToken.append(SALT_ALPHABET.charAt(index));
		}
		
		String saltString = saltToken.toString();
		return saltString;
	}
	
}
