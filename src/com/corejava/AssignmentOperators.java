package com.corejava;

public class AssignmentOperators {
//+= -= *= /+ %=
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		
		int result = a + b;
		
		//result = result + 5.5;
		result = (int)(result +5.5);//Explicit Type Casting
		System.out.println("Explicit TC : "+result);
		result += 5.5;//Narrowing
		System.out.println(result);
		
//		result = result - 5.5;
		result -= 5.5;
		System.out.println(result);
		
//		result = result * 5.5;
		result *= 5.5;
		System.out.println(result);
		
//		result = result / 5.5;
		result /= 5.5;
		System.out.println(result);
		
//		result = result % 5.5;
		result %= 5.5;
		System.out.println(result);

	}

}
