package com.travelport.RestCouchbaseSpringData;

import org.springframework.data.annotation.Id;

public class Country {

	@Id 
	private String id;

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
