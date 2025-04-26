package com.s2p.FCT.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.s2p.FCT.entity.Product;

public interface ProductRepository extends JpaRepository<Product,String>{
	
	public boolean existsById(String id);
}