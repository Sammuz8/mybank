package com.curso.mybank;

import com.curso.mybank.domain.Account;
import com.curso.mybank.domain.Customer;

public class Application
{
	public static void main( String[] args )
	{
		Account cuenta=new Account(500.0);
		Customer cliente= new Customer("Luis", "Ramos");
		cliente.setAccount(cuenta);
		
		System.out.println("Creando el cliente "+cliente.getFirstName()+
				" "+cliente.getLastName());
		
		System.out.println("Creando su cuenta bancario con saldo "+
				cliente.getAccount().getBalance());
		
		System.out.print("Sacar 150.00:"+ cliente.getAccount().withdraw(150));
		
		System.out.print("\nIngresar 22.50:"+cliente.getAccount().deposit(22.5));
		
		System.out.print("\nSacar 47.62:"+cliente.getAccount().withdraw(47.62));
		
		System.out.print("\nSacar 400.00:"+cliente.getAccount().withdraw(400.00));
		
		System.out.println("\n"+cliente);
		
	}
}