package com.corejava;

public class Banking {
	
	double balance = 10000.00;

	void main(String[] args) {
		System.out.println("main method started");
		checkBalance();
		deposite(5000);
		withdrawal(2000);
		System.out.println("main method ended");
	}
	
	void checkBalance() {
		System.out.println("The current balance is : "+balance);
	}
	
	void deposite(double amount) {
		System.out.println("Desposit method called");
		balance = balance + amount;
		checkBalance();
	}
	
	void withdrawal(double amount) {
		System.out.println("Withdrawal method called");
		if(amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Transaction failed due to insufficient funds");
		}
		checkBalance();
	}

}
