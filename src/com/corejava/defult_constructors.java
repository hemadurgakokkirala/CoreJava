package com.corejava;

import java.util.Scanner;

public class defult_constructors {
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
	// below scanner object won't be created because it has no constructor.
	//	Scanner sc = new Scanner();
	// below scanner object will create because jvm will provide default constructor.
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		
		System.out.println("main method ended");

	}

}
