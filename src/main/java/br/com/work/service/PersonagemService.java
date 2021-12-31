package br.com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.work.domain.PersonagemList;
import br.com.work.domain.Personagens;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonagemService {

	@Autowired
	private WebClient webClient;

	public Mono<Personagens> obterPorId(String id) {
		return this
				.webClient.method(HttpMethod.GET)
				.uri("/character/{id}", id)
				.retrieve()
				.bodyToMono(Personagens.class);
	}

	public Flux<PersonagemList> obterPersonagens() {
		return this
				.webClient.method(HttpMethod.GET)
				.uri("/character")
				.retrieve()
				.bodyToFlux(PersonagemList.class);
	}
	
	public Flux<PersonagemList> obterPersonagensPorStatus() {
		return this
				.webClient.method(HttpMethod.GET)
				.uri("/character/?status=unknown")
				.retrieve()
				.bodyToFlux(PersonagemList.class);
	}
	
}
