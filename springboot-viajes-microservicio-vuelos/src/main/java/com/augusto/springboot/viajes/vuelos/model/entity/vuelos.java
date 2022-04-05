package com.augusto.springboot.viajes.vuelos.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "vuelos")

public class vuelos implements Serializable{
	
	private static final long serialVersionUID = 9060005550484095017L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)	
	private int id;
	
	private String compania;
	
	private Double precio;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private int plazas;
	
	private String destino;

	public String getCompañia() {
		return compania;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setCompañia(String compañia) {
		this.compania = compañia;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	
	
	
}
