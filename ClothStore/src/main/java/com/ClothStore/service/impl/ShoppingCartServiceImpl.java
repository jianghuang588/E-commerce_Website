package com.ClothStore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClothStore.domain.CartItem;
import com.ClothStore.domain.ShoppingCart;
import com.ClothStore.repository.ShoppingCartRepository;
import com.ClothStore.service.CartItemService;
import com.ClothStore.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	@Autowired
	private CartItemService checkoutItemService;
	
	@Autowired
	private ShoppingCartRepository cartStorage;
	
	
	public ShoppingCart updateShoppingCart(ShoppingCart cart) {
		
		// intital is 0 
		BigDecimal total = new BigDecimal(0);
		
		// all item on the shopping cart 
		List<CartItem> checkoutItems = checkoutItemService.findByShoppingCart(cart);
		
		// iterm over checkoutItems if item quality is greater than 0, add to shopping cart, and add to the total
		for (CartItem item : checkoutItems) {
			if(item.getShirt().getInStockNumber() > 0) { 
				// update cart item, set price = "", where id = ""
				checkoutItemService.updateCartItem(item);
				// add tot the total 
				total = total.add(item.getPretotal());
			}
		}
		
		cart.setTotal(total);
		
		cartStorage.save(cart);
		
		return cart;
	}
	
	public void clearShoppingCart(ShoppingCart item) {
	
		// clear the shopping cart 
		List<CartItem> selectedCartItems = checkoutItemService.findByShoppingCart(item);
		
		for (CartItem cartItem : selectedCartItems) {
			cartItem.setShoppingCart(null);
			checkoutItemService.save(cartItem);
		}
		
		item.setTotal(new BigDecimal(0));
		
		cartStorage.save(item);
	}
	
	
	
}
