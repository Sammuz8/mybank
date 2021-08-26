package com.curso.mybank;

import com.curso.mybank.domain.Account;
import com.curso.mybank.domain.CheckingAccount;
import com.curso.mybank.domain.Customer;
import com.curso.mybank.domain.SavingsAccount;

/**
 * esta clase guarda todas los metodos de funcionalidad
 * @author USER
 *
 */
public class AuxiliarFunciones {
	
	
	public static Customer crearCliente(String nombre, String apellido) {
		Customer cliente= new Customer(nombre, apellido);
	
		System.out.println("Creando cliente "+cliente.getFirstName()+
				" "+cliente.getLastName());
		return cliente;
	}
	
	public static void crearSavingAccount(Customer cliente, double inibalance, double interes) {
		SavingsAccount newAccount= new SavingsAccount(inibalance, interes);
		System.out.println("Creando su Savings Account con balance de "+ inibalance
				+" y "+interes+"% de interes.");
		//cliente.setAccount(newAccount);
		cliente.addAccount(newAccount);
	}
	
	public static void crearCheckingAccount(Customer cliente, double inibalance, double overdraftAmount) {
		CheckingAccount newAccount = new CheckingAccount(inibalance, overdraftAmount);
		System.out.println("Creando su Checking Account con balance de "+ inibalance
				+" y "+overdraftAmount+" de proteccion overdraft.");
		//cliente.setAccount(newAccount);
		cliente.addAccount(newAccount);
	}
	
	public static void crearCheckingAccount(Customer cliente, double inibalance) {
		CheckingAccount newAccount = new CheckingAccount(inibalance);
		System.out.println("Creando su Checking Account con balance de "+ inibalance
				+" y sin proteccion overdraft.");
		//cliente.setAccount(newAccount);
		cliente.addAccount(newAccount);
	}
	
	public static void compartirAccount(Customer cliente1,Customer cliente2, int numAccountCompartido) {
		System.out.println(cliente1.getFirstName()+
				" Comparte su cuenta con "+cliente2.getFirstName());
		//cliente1.setAccount(cliente2.getAccount());
		cliente1.addAccount(cliente2.getAccount(numAccountCompartido));
	}
	
	public static void operarSavingAccount(Customer cliente, int numAccount) {
		
		System.out.println("Acciones de cliente "+cliente.getFirstName()
				+" "+cliente.getLastName()+" con su Saving Account");
		
		System.out.print("Sacar 150.00:"+ cliente.getAccount(numAccount).withdraw(150));
		
		System.out.print("\nIngresar 22.50:"+cliente.getAccount(numAccount).deposit(22.5));
		
		System.out.print("\nSacar 47.62:"+cliente.getAccount(numAccount).withdraw(47.62));
		
		System.out.print("\nSacar 400.00:"+cliente.getAccount(numAccount).withdraw(400.00));
		
		System.out.println("\n"+cliente);
	}
	
	public static void operarCheckingAccount(Customer cliente, int numAccount) {
		boolean hasOverdraft=false; 
		if (cliente.getAccount(numAccount) instanceof CheckingAccount) {
			CheckingAccount cuenta= (CheckingAccount) cliente.getAccount(0);
			hasOverdraft=cuenta.getOverdraftAmount()==0.0;
		}
		
		System.out.println("Acciones de cliente "+cliente.getFirstName()
				+" "+cliente.getLastName()+" con su Checking Account "
				+(hasOverdraft ? " con " : " sin ")+" proteccion overdraft.");
		
		System.out.print("Sacar 150.00:"+ cliente.getAccount(numAccount).withdraw(150));
		
		System.out.print("\nIngresar 22.50:"+cliente.getAccount(numAccount).deposit(22.5));
		
		System.out.print("\nSacar 47.62:"+cliente.getAccount(numAccount).withdraw(47.62));
		
		System.out.print("\nSacar 400.00:"+cliente.getAccount(numAccount).withdraw(400.00));
		
		System.out.println("\n"+cliente);
	}
	
	public static void operarCuentacompartida(Customer cl3, Customer cl4) {
		System.out.println("Acciones de cliente "+cl4.getFirstName()
		+" con su Checking Account compartido con "+cl3.getFirstName());
		Account cuenta=cl4.getAccount(0);
		
		System.out.print("Ingresar 150.00:"+cuenta.deposit(150.00));
		
		System.out.print("\nSacar 750.00:"+cuenta.withdraw(750.00));
		
		System.out.println("\n"+cl4);
	}

	public static void mostrarCuentasCliente(Customer cliente) {
		System.out.println("Customer: "+cliente.getFirstName()+" "+cliente.getLastName());
		int numAccount=cliente.getNumOfAccounts();
		for (int i = 0; i < numAccount; i++) {
			Account cuenta=cliente.getAccount(i);
			
			if(cuenta instanceof SavingsAccount) {
				System.out.println("Savings Account: current balance is "+cuenta.getBalance());
			}
			if(cuenta instanceof CheckingAccount) {
				System.out.println("Checking Account: current balance is "+cuenta.getBalance());
			}
		}
	}
}
