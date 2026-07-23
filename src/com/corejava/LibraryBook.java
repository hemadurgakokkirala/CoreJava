package com.corejava;

import java.util.Scanner;

public class LibraryBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book ID : ");
		int bookID = sc.nextInt();
		System.out.println("Enter Book Name : ");
		sc.nextLine();
		String bookName = sc.nextLine();
		System.out.println("Enter Author : ");
		String author = sc.nextLine();
		System.out.println("Enter Price : ");
		float price = sc.nextFloat();
		
		libraryBooks lb = new libraryBooks(bookID, bookName, author, price);
		lb.display();
		
		sc.close();
	}

}

class libraryBooks {
	
	int bookID;
	String bookName;
	String author;
	float price;
	
	libraryBooks(int bookID, String bookName, String author, float price) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println("Book ID : "+bookID);
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Author : "+author);
		System.out.println("Book Price : "+price);
	}
}
