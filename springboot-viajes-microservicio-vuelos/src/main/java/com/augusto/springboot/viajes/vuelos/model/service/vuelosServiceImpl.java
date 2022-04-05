package com.augusto.springboot.viajes.vuelos.model.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.augusto.springboot.viajes.vuelos.model.dao.vuelosDao;
import com.augusto.springboot.viajes.vuelos.model.entity.vuelos;

@Service
public class vuelosServiceImpl implements IVuelosService {

	@Autowired
	private vuelosDao vuelosDao;

	@Override
	@Transactional
	public List<vuelos> recuperarVuelosDisponibles(int plazas) {
		List<vuelos> listaVuelos = (List<vuelos>) vuelosDao.findAll();
		return listaVuelos.stream().filter(t -> t.getPlazas() >= plazas).collect(Collectors.toList());
	}

	@Override
	@Transactional
	public void actualizarPlazas(int id, int plazas) {

		vuelos tempVuelos = vuelosDao.findById(id).orElse(null);
		if (tempVuelos != null) {
			tempVuelos.setPlazas(tempVuelos.getPlazas() - plazas);
			vuelosDao.save(tempVuelos);

		}

	}

	@Override
	@Transactional
	public List<vuelos> buscarDestino(String destino) {
		return (List<vuelos>) vuelosDao.findByDestino(destino);
	}
}