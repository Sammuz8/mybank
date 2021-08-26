package com.curso.mybank;

import com.curso.mybank.domain.Account;
import com.curso.mybank.domain.CheckingAccount;
import com.curso.mybank.domain.Customer;
import com.curso.mybank.domain.SavingsAccount;

public class TestingBanking
{
	public static void main( String[] args )
	{
		
		Customer cl1= AuxiliarFunciones.crearCliente("Jane", "Smith");
		AuxiliarFunciones.crearSavingAccount(cl1, 500, 3);
		Customer cl2= AuxiliarFunciones.crearCliente("Owen", "Bryant");
		AuxiliarFunciones.crearCheckingAccount(cl2, 500);
		Customer cl3= AuxiliarFunciones.crearCliente("Tim", "Soley");
		AuxiliarFunciones.crearCheckingAccount(cl3, 500, 500);
		Customer cl4= AuxiliarFunciones.crearCliente("Maria", "Soley");
		//pasa el atributo 0, es la primera cuenta del usuario
		AuxiliarFunciones.compartirAccount(cl4, cl3,0);
		
		AuxiliarFunciones.operarSavingAccount(cl1,0);
		AuxiliarFunciones.operarCheckingAccount(cl2,0);
		AuxiliarFunciones.operarCheckingAccount(cl3,0);
		
		AuxiliarFunciones.operarCuentacompartida(cl3, cl4);
		
	}

	
}