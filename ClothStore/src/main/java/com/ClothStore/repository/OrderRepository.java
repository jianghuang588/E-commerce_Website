package com.ClothStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ClothStore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
