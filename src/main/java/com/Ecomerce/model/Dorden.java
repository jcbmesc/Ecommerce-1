package com.Ecomerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dordenes")
public class Dorden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    
    @OneToOne
    private Orden Orden; 
    @ManyToOne
    private Producto Producto; 

    // Constructor
    public Dorden(int id, String nombre, int cantidad, double precio, double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

   
   
    // Método toString()
    @Override
    public String toString() {
        return "Dorden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + "]";
    }
    // Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Orden getOrden() {
		return Orden;
	}

	public void setOrden(Orden Orden) {
		this.Orden = Orden;
	}

	public Producto getProducto() {
		return Producto;
	}

	public void setProducto(Producto Producto) {
		this.Producto = Producto;
	}
	
}

