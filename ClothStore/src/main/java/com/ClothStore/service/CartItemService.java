package com.ClothStore.service;

import java.util.List;

import com.ClothStore.domain.CartItem;
import com.ClothStore.domain.Order;
import com.ClothStore.domain.Shirt;
import com.ClothStore.domain.ShoppingCart;
import com.ClothStore.domain.User;

public interface CartItemService {
	
	// define contract of findByShoppingCart information
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	// define contract of updateCartItem 
	CartItem updateCartItem(CartItem cartItem);
	
	// define contract of addShirtToCartItem 
	CartItem addShirtToCartItem(Shirt shirt, User user, int qty);

	// define contract of findById 
	CartItem findById(Long id);

	// define contract of removeCartItem 
	void removeCartItem(CartItem cartItem);
	
	// define contract of cartItem 
	CartItem save(CartItem cartItem);

	// define contract to find the order information 
	List<CartItem> findByOrder(Order order);

	
}
