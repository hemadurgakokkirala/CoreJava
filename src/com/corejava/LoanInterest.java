package com.corejava;

import java.util.Scanner;

public class LoanInterest {
	
	double calculateInterest(double principle, double rate, int time) {
		System.out.println("Principle Amount : "+principle);
		System.out.println("Rate of Interest : "+rate+"%");
		System.out.println("Time (years) : "+time);
		double si = (principle+rate+time)/100;
		System.out.println("Simple Interest : "+si);
		return si;
		
	}

	void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle amount : ");
		double principle = sc.nextDouble();
		System.out.println("Enter the Rate of Interest : ");
		double rate = sc.nextDouble();
		System.out.println("Enter Timein years : ");
		int time = sc.nextInt();
		calculateInterest(principle,rate,time);
		
		sc.close();
		System.out.println("main method ended");

	}

}
