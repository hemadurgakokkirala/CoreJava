package com.corejava;

public class BankAccount {
	
	long accountNumber=301116766;
	String accountHolderName="Hema Durga";
	String accountType="Saving Account";
	double balance=50000.00;

	void main(String[] args) {
		System.out.println("main method started");
//		BankAccount ba = new BankAccount();
		displayAccount();
		
		System.out.println("main method ended");

	}
	
	void displayAccount() {
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Balance             : "+balance);
		
		
	}	

}
