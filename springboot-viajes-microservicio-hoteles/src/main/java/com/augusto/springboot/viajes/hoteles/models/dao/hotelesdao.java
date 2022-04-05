package com.augusto.springboot.viajes.hoteles.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.augusto.springboot.viajes.hoteles.models.entity.hoteles;

public interface hotelesdao extends CrudRepository<hoteles, Integer> {
	
	public List<hoteles> findByUbicacion(String ubi);
	

}
