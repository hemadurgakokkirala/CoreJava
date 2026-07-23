package com.corejava;

public class MultipleConstructors {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		laptop l1 = new laptop();
		System.out.println(l1);
		
		laptop l2 = new laptop("Dell");
		System.out.println(l2);
		
		laptop l3 = new laptop("Lenovo", 70000);
		System.out.println(l3);
		
		System.out.println("main method ended");

	}

}

class laptop {
	
	laptop(){
		System.out.println("constructor 1 called");
	}
	
	laptop(String brand){
		System.out.println("constructor 2 called");
		System.out.println("Brand : "+brand);
	}
	
	laptop(String brand, int price){
		System.out.println("constructor 3 called");
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
	}
}
