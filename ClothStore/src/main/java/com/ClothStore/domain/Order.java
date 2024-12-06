package com.ClothStore.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identifyer;
	private Date dateOfOrder;
	private Date dateOfShipping;
	private String methodOfShipping;
	private String statusOfOrder;
	private BigDecimal totalOfOrder;
	
	@OneToMany(mappedBy = "order", cascade=CascadeType.ALL )
	private List<CartItem> cartItemList;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ShippingAddress shippingAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private BillingAddress billingAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;
	
	@ManyToOne
	private User user;

	public Long getIdentifyer() {
		return identifyer;
	}

	public void setIdentifyer(Long identifyer) {
		this.identifyer = identifyer;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public Date getDateOfShipping() {
		return dateOfShipping;
	}

	public void setDateOfShipping(Date dateOfShipping) {
		this.dateOfShipping = dateOfShipping;
	}

	public String getMethodOfShipping() {
		return methodOfShipping;
	}

	public void setMethodOfShipping(String methodOfShipping) {
		this.methodOfShipping = methodOfShipping;
	}

	public String getStatusOfOrder() {
		return statusOfOrder;
	}

	public void setStatusOfOrder(String statusOfOrder) {
		this.statusOfOrder = statusOfOrder;
	}

	public BigDecimal getTotalOfOrder() {
		return totalOfOrder;
	}

	public void setTotalOfOrder(BigDecimal totalOfOrder) {
		this.totalOfOrder = totalOfOrder;
	}

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
