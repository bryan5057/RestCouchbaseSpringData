package com.travelport.RestCouchbaseSpringData;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class Traveler {

	@Id 
	private String id;

	private String firstName;
	private String lastName;
	
	private String emailAddress;

	private Set<Address> addresses = new HashSet<Address>();
	
	private Set<FormOfPayment> formsOfPayment = new HashSet<FormOfPayment>();
	
	private Set<Account> accounts = new HashSet<Account>();
	
	public Traveler(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the addresses
	 */
	public Set<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the formsOfPayment
	 */
	public Set<FormOfPayment> getFormsOfPayment() {
		return formsOfPayment;
	}

	/**
	 * @param formsOfPayment the formsOfPayment to set
	 */
	public void setFormsOfPayment(Set<FormOfPayment> formsOfPayment) {
		this.formsOfPayment = formsOfPayment;
	}

	/**
	 * @return the accounts
	 */
	public Set<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
}
