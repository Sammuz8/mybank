package com.curso.mybank.domain;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID=1L;

	protected double balance;

	protected Account(double balance) {
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
	public boolean withdraw(double retirada) throws OverdraftException {
		if (retirada<=0) return false;
		if (retirada>getBalance()){
			throw new OverdraftException("cantidad retirada supera el limite",
					retirada-getBalance());
		}else {
			balance-=retirada;
		}
		return true;
	}
	
}
