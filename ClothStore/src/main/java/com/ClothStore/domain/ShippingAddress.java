package com.ClothStore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ShippingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identity;
	private String NameOfShippingAddress;
	private String StreetOneOfShippingAddress;
	private String StreetTwoOfShippingAddress;
	private String CityOfShippingAddress;
	private String StateOfShippingAddress;
	private String CountryOfShippingAddress;
	private String ZipcodeOfShippingAddress;
	
	
	@OneToOne
	private Order order;


	public Long getIdentity() {
		return identity;
	}


	public void setIdentity(Long identity) {
		this.identity = identity;
	}


	public String getNameOfShippingAddress() {
		return NameOfShippingAddress;
	}


	public void setNameOfShippingAddress(String nameOfShippingAddress) {
		NameOfShippingAddress = nameOfShippingAddress;
	}


	public String getStreetOneOfShippingAddress() {
		return StreetOneOfShippingAddress;
	}


	public void setStreetOneOfShippingAddress(String streetOneOfShippingAddress) {
		StreetOneOfShippingAddress = streetOneOfShippingAddress;
	}


	public String getStreetTwoOfShippingAddress() {
		return StreetTwoOfShippingAddress;
	}


	public void setStreetTwoOfShippingAddress(String streetTwoOfShippingAddress) {
		StreetTwoOfShippingAddress = streetTwoOfShippingAddress;
	}


	public String getCityOfShippingAddress() {
		return CityOfShippingAddress;
	}


	public void setCityOfShippingAddress(String cityOfShippingAddress) {
		CityOfShippingAddress = cityOfShippingAddress;
	}


	public String getStateOfShippingAddress() {
		return StateOfShippingAddress;
	}


	public void setStateOfShippingAddress(String stateOfShippingAddress) {
		StateOfShippingAddress = stateOfShippingAddress;
	}


	public String getCountryOfShippingAddress() {
		return CountryOfShippingAddress;
	}


	public void setCountryOfShippingAddress(String countryOfShippingAddress) {
		CountryOfShippingAddress = countryOfShippingAddress;
	}


	public String getZipcodeOfShippingAddress() {
		return ZipcodeOfShippingAddress;
	}


	public void setZipcodeOfShippingAddress(String zipcodeOfShippingAddress) {
		ZipcodeOfShippingAddress = zipcodeOfShippingAddress;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
