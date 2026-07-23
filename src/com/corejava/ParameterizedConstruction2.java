package com.corejava;

import java.util.Scanner;

public class ParameterizedConstruction2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand : ");
		String brand = sc.nextLine();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		
		Mobile m = new Mobile(brand, price);
		m.show();
		
		sc.close();

	}

}

class Mobile {
	 String brand;
	 double price;
	 
	 Mobile(String brand, double price) {
		 this.brand = brand;
		 this.price = price;
	 }
	 
	 void show() {
		 System.out.println("Enter Brand : "+brand);
		 System.out.println("Enter Price : "+price);
	 }
}