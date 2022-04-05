package com.augusto.springboot.viajes.vuelos.model.service;

import java.util.List;
import com.augusto.springboot.viajes.vuelos.model.entity.vuelos;

public interface IVuelosService {
	
	public List<vuelos> buscarDestino(String destino);
	public List<vuelos> recuperarVuelosDisponibles(int plazas);
	public void actualizarPlazas(int id, int plazas);

}
