package com.corejava;

import java.util.Scanner;

public class ParameterizedConstructors4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder Name  :");
		String accountHolder = sc.nextLine();
		System.out.println("Enter Balance :");
		Double balance = sc.nextDouble();
		
		BankAccount1 b = new BankAccount1(accountHolder, balance);
		b.display();
		
		sc.close();
	}

}

class BankAccount1 {
	String accountHolder;
	double balance;
	int depAmt;
	int wdAmt;
	
	Scanner sc = new Scanner(System.in);
	
	BankAccount1(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	double deposit() {
		System.out.println("Enter Deposit Amount : ");
		depAmt = sc.nextInt();
		balance = balance + depAmt;
		return balance;
	}
	
	double withdraw() {
		System.out.println("Enter Withdrawal Amount : ");
		wdAmt = sc.nextInt();
		balance = balance - wdAmt;
		return balance;
	}
	
	void display() {
		System.out.println("Account Holder Name : "+accountHolder);
		System.out.println("Total Balance : "+this.balance);
		System.out.println("Deposit Amount : "+deposit());
		System.out.println("Withdrawal Amount : "+withdraw());
		System.out.println("Total Balance : "+balance);
	}
}
