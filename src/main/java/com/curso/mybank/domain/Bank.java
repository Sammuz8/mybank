package com.curso.mybank.domain;

public class Bank {

	private static Customer[]customers;
	private static int numberOfCustomers;
	
	static {
		customers= new Customer[100];
		numberOfCustomers=0;
	}
	public Bank() {
		
	}
	public static void addCustomer(String firstName, String lastName) {
		customers[numberOfCustomers]=new Customer(firstName, lastName);
		numberOfCustomers++;
	}
	public static int getNumOfCustomers() {
		return numberOfCustomers+1;
	}
	public static Customer getCustomer(int index) {
		return customers[index];
	}
}
