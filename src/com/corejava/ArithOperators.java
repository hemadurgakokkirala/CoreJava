package com.corejava;

public class ArithOperators {	
//+ - * / %
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 5;
		
		//without adding brackets it will become concatenation
		System.out.println("Concatenation : "+ a + b);
		//Addition
		System.out.println("Addition : "+(a+b));
		//Subtraction
		System.out.println("Subraction : "+(a-b));
		//Multiplication
		System.out.println("Multiplication : "+(a*b));
		//Division
		System.out.println("Division : "+(a/b));//Quotient
		//Modulus Division
		System.out.println("Modulus Division : "+(a%b));//Remainder
	}

}
