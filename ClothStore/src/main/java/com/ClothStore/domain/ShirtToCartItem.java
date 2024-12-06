package com.ClothStore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class ShirtToCartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="shirt_id")
	private Shirt shirt;
	
	@ManyToOne
	@JoinColumn(name="cart_item_id")
	private CartItem cartItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Shirt getShirt() {
		return shirt;
	}

	public void setShirt(Shirt shirt) {
		this.shirt = shirt;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}
	
	
}

