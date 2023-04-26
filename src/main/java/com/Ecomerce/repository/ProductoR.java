package com.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecomerce.model.Producto;
@Repository
public interface ProductoR extends JpaRepository<Producto, Integer> {

	

	
}
