package com.Admin.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



/**
 * https://www.udemy.com/course/complete-e-commerce-course-javaspringhibernate-and-mysql/learn/lecture/6364716#questions
 * https://www.udemy.com/course/complete-e-commerce-course-javaspringhibernate-and-mysql/learn/lecture/6364716#questions
 */

@Entity
public class UserBilling {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String NameOfUserBilling;
	private String StreetOneUserBilling;
	private String StreetTwoUserBilling;
	private String BillingCityOfUser;
	private String BillingStateOfUser;
	private String BillingCountryForUser;
	private String BillingZipcodeForUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	private UserPayment userPayment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOfUserBilling() {
		return NameOfUserBilling;
	}

	public void setNameOfUserBilling(String nameOfUserBilling) {
		NameOfUserBilling = nameOfUserBilling;
	}

	public String getStreetOneUserBilling() {
		return StreetOneUserBilling;
	}

	public void setStreetOneUserBilling(String streetOneUserBilling) {
		StreetOneUserBilling = streetOneUserBilling;
	}

	public String getStreetTwoUserBilling() {
		return StreetTwoUserBilling;
	}

	public void setStreetTwoUserBilling(String streetTwoUserBilling) {
		StreetTwoUserBilling = streetTwoUserBilling;
	}

	public String getBillingCityOfUser() {
		return BillingCityOfUser;
	}

	public void setBillingCityOfUser(String billingCityOfUser) {
		BillingCityOfUser = billingCityOfUser;
	}

	public String getBillingStateOfUser() {
		return BillingStateOfUser;
	}

	public void setBillingStateOfUser(String billingStateOfUser) {
		BillingStateOfUser = billingStateOfUser;
	}

	public String getBillingCountryForUser() {
		return BillingCountryForUser;
	}

	public void setBillingCountryForUser(String billingCountryForUser) {
		BillingCountryForUser = billingCountryForUser;
	}

	public String getBillingZipcodeForUser() {
		return BillingZipcodeForUser;
	}

	public void setBillingZipcodeForUser(String billingZipcodeForUser) {
		BillingZipcodeForUser = billingZipcodeForUser;
	}

	public UserPayment getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(UserPayment userPayment) {
		this.userPayment = userPayment;
	}
	
	
	

	
}
