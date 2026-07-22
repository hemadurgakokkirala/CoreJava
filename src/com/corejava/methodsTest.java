package com.corejava;

public class methodsTest {

	void main(String[] args) {
		System.out.println("main method started");
		hello();
		addition();
		System.out.println("main method ended");

	}
	
	//no arguments + no return type
	void hello() {
		System.out.println("Hello !");
	}
	
	//no arguments + return type
	int addition()
	{
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println("Addition : "+sum);
		return sum;
	}
	
	
	

}
