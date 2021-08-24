package com.curso.mybank.domain;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID=1L;

	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}



	@Override
	public String toString() {
		return "Customer ["+getFirstName()+", "+getLastName()+
				"] tiene un saldo de "+getAccount().getBalance();
	}
	
}
