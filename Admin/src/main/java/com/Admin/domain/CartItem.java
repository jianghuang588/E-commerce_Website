package com.Admin.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identity;
	private int quality;
	private BigDecimal pretotal;
	
	@OneToOne
	private Shirt shirt;
	
	@OneToMany(mappedBy = "cartItem")
	@JsonIgnore
	private List<ShirtToCartItem> shirtToCartItemList;
	

	@ManyToOne
	@JoinColumn(name="shopping_cart_id")
	private ShoppingCart shoppingCart;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	public Long getIdentity() {
		return identity;
	}

	public void setIdentity(Long identity) {
		this.identity = identity;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public BigDecimal getPretotal() {
		return pretotal;
	}

	public void setPretotal(BigDecimal pretotal) {
		this.pretotal = pretotal;
	}

	public Shirt getShirt() {
		return shirt;
	}

	public void setShirt(Shirt shirt) {
		this.shirt = shirt;
	}

	public List<ShirtToCartItem> getShirtToCartItemList() {
		return shirtToCartItemList;
	}

	public void setShirtToCartItemList(List<ShirtToCartItem> shirtToCartItemList) {
		this.shirtToCartItemList = shirtToCartItemList;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	
}
