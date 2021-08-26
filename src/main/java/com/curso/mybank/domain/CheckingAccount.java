package com.curso.mybank.domain;

public class CheckingAccount extends Account {

	private double overdraftAmount;

	public CheckingAccount(double initbalance, double overdraftAmount) {
		super(initbalance);
		// TODO Auto-generated constructor stub
		this.overdraftAmount = overdraftAmount;
	}

	public CheckingAccount(double initbalance) {
		this(initbalance, 0.0);
	}
	
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	@Override
	public boolean withdraw(double retirada) {
		// TODO Auto-generated method stub
		double overdraftNeeded = 0;
		if (balance < retirada) {
			overdraftNeeded = retirada - balance;
			
			if (overdraftAmount < overdraftNeeded) {
				return false;
			} else {
				balance = 0;
				overdraftAmount -= overdraftNeeded;
			}
			
		} else {
			balance -= retirada;
		}

		return true;
	}
}
