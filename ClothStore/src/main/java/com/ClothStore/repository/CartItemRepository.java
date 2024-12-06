package com.ClothStore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ClothStore.domain.CartItem;
import com.ClothStore.domain.Order;
import com.ClothStore.domain.ShoppingCart;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long> {

	// select * from cart_item where shopping_cart_id = 1
	// save the product that user has place on shopping cart when user relogin
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	// retrive  specific  product id from the caritem table 
	List<CartItem> findByOrder(Order order);
	
	
}
