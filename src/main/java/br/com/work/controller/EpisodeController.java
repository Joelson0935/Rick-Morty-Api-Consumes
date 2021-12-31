package br.com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.work.domain.Episode;
import br.com.work.domain.EpisodeList;
import br.com.work.service.EpisodeService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Buscar")
public class EpisodeController {

	@Autowired
	private EpisodeService service;

	@GetMapping("/Episode/{id}")
	public Mono<Episode> buscarEpisodioPorId(@PathVariable String id) {
		return service.obterPorId(id);
	}

	@GetMapping("/Episodes")
	public Flux<EpisodeList> buscarEpisodios() {
		return service.obterEpisodios();
	}

}
