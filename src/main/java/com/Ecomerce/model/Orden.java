package com.Ecomerce.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private Date fechaRecibido;
    private Date fechaRealizada;
    private double total;
    
    @ManyToOne
    private Usuario Usuario;
    @OneToOne(mappedBy= "Orden" )
    private Dorden Dorden;

    // Constructor
    public Orden(int id, String nombre, Date fechaRecibido, Date fechaRealizada) {
        this.id = id;
        this.nombre = nombre;
        this.fechaRecibido = fechaRecibido;
        this.fechaRealizada = fechaRealizada;
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

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Date getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(Date fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }
	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", nombre=" + nombre + ", fechaRecibido=" + fechaRecibido + ", fechaRealizada="
				+ fechaRealizada + "]";
	}

}

