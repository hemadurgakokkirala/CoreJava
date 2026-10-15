package com.corejava;

import java.util.Scanner;

public class BankAccount2 {
	String accountHolder;
	double accountNumber;
	double balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount2 ba = new BankAccount2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder Name : ");
		ba.accountHolder = sc.nextLine();
		System.out.println("Enter Account Number : ");
		ba.accountNumber = sc.nextDouble();
		System.out.println("Enter Balance : ");
		ba.balance =sc.nextDouble();
		
		BankAc ba0 = new BankAc();
		
		BankAc ba1 = new BankAc(ba.accountHolder);
		
		BankAc ba2 = new BankAc(ba.accountHolder, ba.accountNumber);
		
		BankAc ba3 = new BankAc(ba.accountHolder, ba.accountNumber, ba.balance);
		
		sc.close();

	}

}

class BankAc {
	String accountHolder;
	double accountNumber;
	double balance;
	
	BankAc(){
		this("unknown");
	}
	
	BankAc(String accountHolder){
		this(accountHolder,0.0);
	}
	
	BankAc(String accountHolder, double accountNumber){
		this(accountHolder, accountNumber, 0.0);
	}
	
	BankAc(String accountHolder, double accountNumber, double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		System.out.println("Account Holder Name : "+accountHolder);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Balance : "+balance);
	}
}
