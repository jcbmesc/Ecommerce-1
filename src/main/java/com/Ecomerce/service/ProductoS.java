package com.Ecomerce.service;
import java.util.List;
import java.util.Optional;
import com.Ecomerce.model.Producto;


public interface ProductoS {
	public Producto save(Producto Producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto Producto);
	public void delete(Integer id);
	public List<Producto> findAll();
	
	
	
}
