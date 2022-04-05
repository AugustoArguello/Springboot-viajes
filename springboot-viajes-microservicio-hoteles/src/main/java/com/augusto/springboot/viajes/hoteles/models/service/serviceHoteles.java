package com.augusto.springboot.viajes.hoteles.models.service;

import java.util.List;

import com.augusto.springboot.viajes.hoteles.models.entity.hoteles;

public interface serviceHoteles {

	public List<hoteles> findByUbicacion(String ubi);
	public List<hoteles> findall();
	public hoteles findById(int id);
	public hoteles save (hoteles hotel);
	public void deleteById(int id);
	public void actualizarPlazas(int id, int plazas);
}
