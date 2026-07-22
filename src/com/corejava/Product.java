package com.corejava;

public class Product {
	
	Integer productID = 024;
	String productName = "Mobile";
	Double productPrice = 20000.0;
	Float productRating = 4.5f;
	Boolean availableStatus = true;
	Integer stockQuantity = 20;
	Double discountPercentage = 10.0;
	Character productCode = 'M';

	public static void main(String[] args) {
		
		Product p = new Product();           
		
		System.out.println("Product Details");
		System.out.println("---------------------");
		System.out.println("Product ID : "+p.productID);
		System.out.println("Product Name : "+p.productName);
		System.out.println("Product Price : "+p.productPrice);
		System.out.println("Product Rating : "+p.productRating);
		System.out.println("Product Available Status : "+p.availableStatus);
		System.out.println("Stock Quantity : "+p.stockQuantity);
		System.out.println("Discount Percentage : "+p.discountPercentage);
		System.out.println("Product Code : "+p.productCode);
		

	}

}
