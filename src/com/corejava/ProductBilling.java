package com.corejava;

import java.util.Scanner;

public class ProductBilling {
	String productName;
	double price;
	int quantity;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBilling pb = new ProductBilling();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		pb.productName = sc.nextLine();
		System.out.println("Enter price : ");
		pb.price = sc.nextDouble();
		System.out.println("Enter quantity : ");
		pb.quantity = sc.nextInt();
		
		ProductBilling p = new ProductBilling(pb.productName, pb.price, pb.quantity);


	}
	
	ProductBilling(){
		this("unknown");
	}
	
	ProductBilling(String productName){
		this(productName,0.0);
	}
	
	ProductBilling(String productName, double price){
		this(productName, price, 0);
	}
	
	ProductBilling(String productName, double price, int quantity){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		
		double totalCost = price * quantity;
		
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Total Cost : "+totalCost);
	}
	

}
