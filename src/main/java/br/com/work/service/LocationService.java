package br.com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.work.domain.Location;
import br.com.work.domain.LocationList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LocationService {

	@Autowired
	private WebClient webClient;

	public Mono<Location> obterPorId(String id) {
		return this.webClient
				.method(HttpMethod.GET)
				.uri("/location/{id}", id)
				.retrieve()
				.bodyToMono(Location.class);
	}

	public Flux<LocationList> obterLocalizacoes() {
		return this.webClient
				.method(HttpMethod.GET)
				.uri("/location")
				.retrieve()
				.bodyToFlux(LocationList.class);
	}
}
