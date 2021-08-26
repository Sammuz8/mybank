package com.curso.mybank.domain;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID=1L;

	private String firstName;
	private String lastName;
	//private Account account;
/*	private static Account[]accounts;
	private static int numOfAccounts;
	static {
		numOfAccounts=0;
		accounts=new Account[5];
	}
*/	
	private Account[]accounts;
	private int numOfAccounts;
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts=new Account[5];
		this.numOfAccounts++;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount(int n) {
		return accounts[n];
	}

	public void addAccount(Account account) {
		this.accounts[numOfAccounts]=account;
		this.numOfAccounts++;
	}
	
	public int getNumOfAccounts() {
		return this.numOfAccounts;
	}


	@Override
	public String toString() {
		return "Customer "+getFirstName()+", "+getLastName();
		//	+" tiene un saldo de "+getAccount().getBalance();
	}
	
}
