package br.com.work.domain;

import java.util.List;

public class EpisodeList {

	private List<Episode> results;

	public EpisodeList() {
		super();
	}

	public EpisodeList(List<Episode> results) {
		super();
		this.results = results;
	}

	public List<Episode> getResults() {
		return results;
	}

	public void setResults(List<Episode> results) {
		this.results = results;
	}

}
