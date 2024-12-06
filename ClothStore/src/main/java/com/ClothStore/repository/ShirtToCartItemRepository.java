package com.ClothStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ClothStore.domain.CartItem;
import com.ClothStore.domain.ShirtToCartItem;

@Transactional
public interface ShirtToCartItemRepository extends CrudRepository<ShirtToCartItem, Long>{
	void deleteByCartItem(CartItem cartItem);
	
}
