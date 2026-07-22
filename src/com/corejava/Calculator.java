package com.corejava;

import java.util.Scanner;

public class Calculator {
	
	int add(int a, int b) {
		int addition = a +b;
		System.out.println("Addition = "+addition);
		return addition;
	}
	
	int subtract(int a, int b) {
		int subtraction = a - b;
		System.out.println("Subtraction = "+subtraction);
		return subtraction;
	}
	
	int multiply(int a, int b) {
		int multiplication = a * b;
		System.out.println("Multiplication = "+multiplication);
		return multiplication;
	}
	
	float division(int a, int b) {
		float division = 0;
		if(b==0) {
			System.err.println("Denominator should not be Zero");
		} else {
		    division = a/b;
			System.out.println("Division = "+division);
		}
		return division;
	}
	

	void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		
		add(a,b);
		subtract(a,b);
		multiply(a,b);
		division(a,b);
		
		sc.close();
		System.out.println("main method ended");

	}

}
