package com.Ecomerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecomerce.model.Producto;
import com.Ecomerce.repository.ProductoR;

@Service
public class ProductoSimplement implements ProductoS{

	@Autowired
	private ProductoR productoR;
	
	
	
	public Producto save(Producto Producto) {
		return productoR.save(Producto);
	}

	
	public Optional<Producto> get(Integer id) {
		return productoR.findById(id);
	}

	
	public void update(Producto Producto) {
		productoR.save(Producto);
	}

	
	public void delete(Integer id) {
		
		
	}


	
	public List<Producto> findAll() {
		
		return productoR.findAll();
	}

	
}
