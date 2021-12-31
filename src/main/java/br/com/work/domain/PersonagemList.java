package br.com.work.domain;

import java.util.List;

public class PersonagemList {

	private List<Personagens> results;

	public PersonagemList() {
		super();
	}

	public PersonagemList(List<Personagens> results) {
		super();
		this.results = results;
	}

	public List<Personagens> getResults() {
		return results;
	}

	public void setResults(List<Personagens> results) {
		this.results = results;
	}

}
