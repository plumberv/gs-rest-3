package com.example.restservice.model;

// this is the data class
public class DRIP {

	private final long id;
	private final String value;

	public DRIP(long id, String value) {
		this.id = id;
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
}
