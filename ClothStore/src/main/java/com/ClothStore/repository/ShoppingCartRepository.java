package com.ClothStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ClothStore.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{
	
}
