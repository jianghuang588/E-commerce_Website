package com.ClothStore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identifier;
	private String BillingRecipientName;
	private String BillingStreetAddress1;
	private String BillingStreetAddress2;
	private String BillingCityName;
	private String BillingStateCode;
	private String BillingCountryName;
	private String BillingPostalCode;
	
	@OneToOne
	private Order PurchaseRequest;

	public Long getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

	public String getBillingRecipientName() {
		return BillingRecipientName;
	}

	public void setBillingRecipientName(String billingRecipientName) {
		BillingRecipientName = billingRecipientName;
	}

	public String getBillingStreetAddress1() {
		return BillingStreetAddress1;
	}

	public void setBillingStreetAddress1(String billingStreetAddress1) {
		BillingStreetAddress1 = billingStreetAddress1;
	}

	public String getBillingStreetAddress2() {
		return BillingStreetAddress2;
	}

	public void setBillingStreetAddress2(String billingStreetAddress2) {
		BillingStreetAddress2 = billingStreetAddress2;
	}

	public String getBillingCityName() {
		return BillingCityName;
	}

	public void setBillingCityName(String billingCityName) {
		BillingCityName = billingCityName;
	}

	public String getBillingStateCode() {
		return BillingStateCode;
	}

	public void setBillingStateCode(String billingStateCode) {
		BillingStateCode = billingStateCode;
	}

	public String getBillingCountryName() {
		return BillingCountryName;
	}

	public void setBillingCountryName(String billingCountryName) {
		BillingCountryName = billingCountryName;
	}

	public String getBillingPostalCode() {
		return BillingPostalCode;
	}

	public void setBillingPostalCode(String billingPostalCode) {
		BillingPostalCode = billingPostalCode;
	}

	public Order getPurchaseRequest() {
		return PurchaseRequest;
	}

	public void setPurchaseRequest(Order purchaseRequest) {
		PurchaseRequest = purchaseRequest;
	}
	
	
}
