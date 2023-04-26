package com.Ecomerce.controlador;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ecomerce.model.Producto;
import com.Ecomerce.model.Usuario;
import com.Ecomerce.service.ProductoS;
@Controller
@RequestMapping("/productos")
public class ProductoC {
	
	private final Logger LOGGER = LoggerFactory.getLogger(Producto.class);
	
	@Autowired
	private ProductoS productoS;
	
	@GetMapping("")
	public String Show(Model model) {
		model.addAttribute("prodcutos", productoS.findAll());
		return "productos/show";
}
	@GetMapping("/create")
public String create() {
		return "productos/create";
	}
	@PostMapping("/save")
	public <usuario> String save(Producto Producto) {
		LOGGER.info("objeto Producto{}", Producto);
		Usuario u= new Usuario(1, "", "", "", "", "", "", "");
		Producto.setUsuario(u);
		productoS.save(Producto);
		return "redirect:/productos";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		Producto producto= new Producto();
		Optional<Producto> optionalProducto=productoS.get(id);
		producto= optionalProducto.get();
		LOGGER.info("busqueda Producto{}", producto);
		model.addAttribute("producto", producto);
		return "productos/edit";
		
	}
	@PostMapping("/update")
	public String UpDate(Producto producto) {
		productoS.update(producto);
		return "redirect/productos";
	}
	
	public String delete(@PathVariable Integer id) {
		productoS.delete(id);
		return "redirect:/productos";
	}
	
	
}