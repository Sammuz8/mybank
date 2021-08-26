package com.curso.mybank;

import com.curso.mybank.domain.Account;
import com.curso.mybank.domain.CheckingAccount;
import com.curso.mybank.domain.Customer;
import com.curso.mybank.domain.SavingsAccount;

public class TestReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cl1= AuxiliarFunciones.crearCliente("Jane", "Smith");
		AuxiliarFunciones.crearSavingAccount(cl1, 500, 3);
		AuxiliarFunciones.crearCheckingAccount(cl1, 200);
		
		Customer cl2= AuxiliarFunciones.crearCliente("Owen", "Bryant");
		AuxiliarFunciones.crearCheckingAccount(cl2, 200);
		
		Customer cl3= AuxiliarFunciones.crearCliente("Tim", "Soley");
		AuxiliarFunciones.crearSavingAccount(cl3, 1500, 3);
		AuxiliarFunciones.crearCheckingAccount(cl3, 200);
		
		Customer cl4= AuxiliarFunciones.crearCliente("Maria", "Soley");
		AuxiliarFunciones.crearSavingAccount(cl4, 200, 3);
		AuxiliarFunciones.crearCheckingAccount(cl4, 150);
		
		System.out.println("==============CUSTOMERS REPORT================");
		AuxiliarFunciones.mostrarCuentasCliente(cl1);
		AuxiliarFunciones.mostrarCuentasCliente(cl2);
		AuxiliarFunciones.mostrarCuentasCliente(cl3);
		AuxiliarFunciones.mostrarCuentasCliente(cl4);
		
	}
	

}
