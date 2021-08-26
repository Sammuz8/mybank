package com.curso.mybank.domain;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(double initbalance, double interestRate) {
		super(initbalance);
		// TODO Auto-generated constructor stub
		this.interestRate=interestRate;
	}

	
}
