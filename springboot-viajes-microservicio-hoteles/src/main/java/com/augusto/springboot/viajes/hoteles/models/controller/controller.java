package com.augusto.springboot.viajes.hoteles.models.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.augusto.springboot.viajes.hoteles.models.entity.hoteles;
import com.augusto.springboot.viajes.hoteles.models.service.classSErviceHoteles;


@RestController
public class controller {

	@Autowired
	private classSErviceHoteles hotelservice;
	
	
	@GetMapping("destino/{ubicacion}")
	public List<hoteles> buscarHotel(@PathVariable String ubicacion) {
		return hotelservice.findByUbicacion(ubicacion);
	}
	
	@PutMapping("/hotel/{id}/adquirimos/{cantidad}")
	@ResponseStatus(HttpStatus.CREATED)
	public void compra (@PathVariable int id, @PathVariable int cantidad) {
		
		hotelservice.actualizarPlazas(id, cantidad);
	}

	
	@GetMapping("/listar")
	public List<hoteles> listar(){
	
		return hotelservice.findall();
	}
	
	@GetMapping("/listar/{id}")
	public hoteles detalle (@PathVariable int id){
		
		return hotelservice.findById(id);
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public hoteles nuevoHotel (@RequestBody hoteles hotel) {
		return hotelservice.save(hotel);	
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public hoteles editarHoteles (@RequestBody hoteles hot, @PathVariable int id) {
		
		hoteles hotel = hotelservice.findById(id);
		hotel.setNombre(hot.getNombre());
		hotel.setCategoria(hot.getCategoria());
		hotel.setPrecio(hot.getPrecio());
		hotel.setDisponibilidad(hot.getDisponibilidad());
		
				
		return hotelservice.save(hotel);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		hotelservice.deleteById(id);
	}
	
}
