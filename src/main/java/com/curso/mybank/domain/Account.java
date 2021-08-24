package com.curso.mybank.domain;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID=1L;

	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	public boolean deposit(double cantidad) {
		if (cantidad<=0) return false;
		balance+=cantidad;
		return true;
	}
	public boolean withdraw(double retirada) {
		if (retirada<=0) return false;
		if (retirada>getBalance()){
			return false;
		}else {
			balance-=retirada;
		}
		return true;
	}
	
}
