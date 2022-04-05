package com.augusto.springboot.viajes.hoteles.models.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.augusto.springboot.viajes.hoteles.models.dao.hotelesdao;
import com.augusto.springboot.viajes.hoteles.models.entity.hoteles;

@Service
public class classSErviceHoteles implements serviceHoteles {

	@Autowired
	private hotelesdao dao;

	@Override
	@Transactional
	public List<hoteles> findall() {
		List<hoteles> hotel = (List<hoteles>) dao.findAll();
		return hotel.stream().filter(t -> t.getDisponibilidad() >= 1).collect(Collectors.toList());
	}

	@Override
	@Transactional
	public hoteles findById(int id) {

		return dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public hoteles save(hoteles hotel) {

		return dao.save(hotel);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<hoteles> findByUbicacion(String ubi) {

		return dao.findByUbicacion(ubi);
	}

	@Override
	@Transactional
	public void actualizarPlazas(int id, int plazas){
		
		
		hoteles temphotel = dao.findById(id).orElse(null);
		if (temphotel != null && temphotel.getDisponibilidad()>plazas) {
			temphotel.setDisponibilidad(temphotel.getDisponibilidad() - plazas);
			dao.save(temphotel);

		}else System.out.println("El hotel:"+temphotel.getNombre()+" no tiene disponibilidad");

	}
}
