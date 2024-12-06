package com.ClothStore.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class ShoppingCart {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identity;
	private BigDecimal total;
	
	@OneToMany(mappedBy="shoppingCart", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JsonIgnore
	private List<CartItem> listItem;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	public Long getIdentity() {
		return identity;
	}

	public void setIdentity(Long identity) {
		this.identity = identity;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<CartItem> getListItem() {
		return listItem;
	}

	public void setListItem(List<CartItem> listItem) {
		this.listItem = listItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
