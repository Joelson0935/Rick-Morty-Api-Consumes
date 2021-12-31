package br.com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.work.domain.Location;
import br.com.work.domain.LocationList;
import br.com.work.service.LocationService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Buscar")
public class LocationController {

	@Autowired
	private LocationService service;

	@GetMapping("/Location/{id}")
	public Mono<Location> buscarLocalizacaoPorId(@PathVariable String id) {
		return service.obterPorId(id);
	}

	@GetMapping("/Locations")
	public Flux<LocationList> buscarLocalizacoes() {
		return service.obterLocalizacoes();
	}

}
