package com.augusto.springboot.viajes.vuelos.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.augusto.springboot.viajes.vuelos.model.entity.vuelos;
import com.augusto.springboot.viajes.vuelos.model.service.IVuelosService;

@RestController
public class vueloscontrollers {
	
	@Autowired
	private IVuelosService vuelosService;
	
	@GetMapping("/destino/{destino}")
	public List<vuelos> buscardestino(@PathVariable String destino){
		return vuelosService.buscarDestino(destino);
	}
	
	
	@GetMapping("/vuelos/{plazas}")
	public List<vuelos> vuelosDisponibles(@PathVariable int plazas){
		
		return vuelosService.recuperarVuelosDisponibles(plazas);		
	}
	
	@PutMapping("/vuelos/{id}/adquirimos/{cantidad}")
	@ResponseStatus(HttpStatus.CREATED)
	public void compra (@PathVariable int id, @PathVariable int cantidad) {
	
		vuelosService.actualizarPlazas(id, cantidad);
	}

}
