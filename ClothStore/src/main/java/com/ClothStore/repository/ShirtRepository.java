package com.ClothStore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ClothStore.domain.Shirt;

public interface ShirtRepository extends CrudRepository<Shirt, Long>{
	
	// select * from shirt where category = "select the category" 
	List<Shirt> findByCategory(String category);

	// select * from shirt where title like '%provided_title%';
	List<Shirt> findByTitleContaining(String title);


}
