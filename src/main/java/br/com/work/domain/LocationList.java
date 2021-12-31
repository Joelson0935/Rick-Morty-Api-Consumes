package br.com.work.domain;

import java.util.List;

public class LocationList {

	private List<Location> results;

	public LocationList() {
		super();
	}

	public LocationList(List<Location> results) {
		super();
		this.results = results;
	}

	public List<Location> getResults() {
		return results;
	}

	public void setResults(List<Location> results) {
		this.results = results;
	}

}
