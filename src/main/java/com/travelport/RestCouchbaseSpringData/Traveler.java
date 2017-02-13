package com.travelport.RestCouchbaseSpringData;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Traveler {

	@Id
	private String id;

	@Field
	private String firstName;

	@Field
	private String lastName;
	
	@Field
	private String email;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Traveler{" + "id='" + this.id + '\'' + ", firstName='" + this.firstName + '\''
				+ ", lastName='" + this.lastName + '\'' + '}';
	}

}

