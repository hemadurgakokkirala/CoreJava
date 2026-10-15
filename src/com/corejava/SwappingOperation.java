package com.corejava;

public class SwappingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 102;
		
		System.out.println("Swapping Operation using third variable");
		System.out.println("*****************************************");
		System.out.println("Before Swapping");
		System.out.println("A value : "+a);
		System.out.println("B value : "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping");
		System.out.println("A value : "+a);
		System.out.println("B value : "+b);
		
		System.out.println("\nSwapping Operation without using third variable");
		System.out.println("*****************************************");
		System.out.println("Before Swapping");
		System.out.println("A value : "+a);//4
		System.out.println("B value : "+b);//10
		
		a = a + b;//14
		b = a - b;//4
		a = a - b;//10
		
		System.out.println("After Swapping");
		System.out.println("A value : "+a);
		System.out.println("B value : "+b);

	}

}
