package com.augusto.springboot.viajes.vuelos.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.augusto.springboot.viajes.vuelos.model.entity.vuelos;

public interface vuelosDao extends CrudRepository<vuelos, Integer> {
	
	public List<vuelos> findByDestino(String destino);

}
