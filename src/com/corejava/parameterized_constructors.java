package com.corejava;

import java.util.Scanner;

public class parameterized_constructors {
	
	public static void main(String[] args) {
//		book b = new book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Name : ");
		String bookName = sc.nextLine();
		System.out.println("Enter Author : ");
		String author = sc.nextLine();
		
		book b = new book(bookName, author);
		b.show();
		
		sc.close();
	}

}

class book {
	
	String bookName;
	String author;
	
	book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	void show(){
		System.out.println("Book Name : "+bookName);
		System.out.println("Author : "+author);
	}
	
}
