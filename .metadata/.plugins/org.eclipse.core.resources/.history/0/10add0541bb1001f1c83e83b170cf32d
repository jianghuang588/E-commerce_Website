package com.ClothStore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.ClothStore.service.impl.UserSecurityService;
import com.ClothStore.utility.SecurityUtility;




@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	// user autheciation
	@Autowired
	private UserSecurityService userSecurityService;
	
	
	private BCryptPasswordEncoder passwordEncoder() {
		return SecurityUtility.passwordEncoder();
			   
	}
	// webpage that can be access without login 
	private static final String[] Accessible_URLs = {
		"/css/**",
		"/js/**",
		"/image/**",
		"/",
		"/newUser",
		"/forgetPassword",
		"/login",
		"/fonts/**",
		"/shirtshelf",
		"/shirtDetail",
		"/hours",
		"/faq",
		"/searchByCategory",
		"/searchShirt",
		"/shirtOne",
		"/shirtTwo",
		"/shirtThree",
		"/shirtFour",
		"/shirtFive",
		"/shirtSix",
		"/shirtSeven",
		"/shirtEight",
		"/shirtNine",
		"/shirtTen",
		"/shirtEleven",
		"/shirtTwelve",
		"/shirtThirteen",
		"/shirtFourteen",
		"/shirtFifteen",
		"/shirtSixteen",
		"/shirtSeventeen",
		"/shirtEighteen"
	
	};
	
   
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests().
		antMatchers(Accessible_URLs).
		permitAll().anyRequest().authenticated();
		
		http
		.csrf().disable().cors().disable()
		.formLogin().failureUrl("/login?error").defaultSuccessUrl("/")
		.loginPage("/login").permitAll()
		.and()
		.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/?logout").deleteCookies("JSESSIONID","remember-me").permitAll()
		.and()
		.rememberMe();
	}

	

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception {
		authentication.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
	}
	
	
}
