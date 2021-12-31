package br.com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.work.domain.PersonagemList;
import br.com.work.domain.Personagens;
import br.com.work.service.PersonagemService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Buscar")
public class PersonagemController {

	@Autowired
	private PersonagemService service;

	@GetMapping("/Person/{id}")
	public Mono<Personagens> buscarPersonagemPorId(@PathVariable String id) {
		return service.obterPorId(id);
	}

	@GetMapping("/Persons")
	public Flux<PersonagemList> buscarPersonagens() {
		return service.obterPersonagens();
	}
	
	@GetMapping("/Status")
	public Flux<PersonagemList> buscarPersonagensPorStatus() {
		return service.obterPersonagensPorStatus();
	}

}
