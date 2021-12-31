package br.com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.work.domain.Episode;
import br.com.work.domain.EpisodeList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EpisodeService {

	@Autowired
	private WebClient webClient;

	public Mono<Episode> obterPorId(String id) {
		return this
				.webClient.method(HttpMethod.GET)
				.uri("/episode/{id}", id)
				.retrieve()
				.bodyToMono(Episode.class);
	}

	public Flux<EpisodeList> obterEpisodios() {
		return this
				.webClient.method(HttpMethod.GET)
				.uri("/episode")
				.retrieve()
				.bodyToFlux(EpisodeList.class);
	}
	
}
