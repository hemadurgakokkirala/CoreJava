package com.corejava;

import java.util.Scanner;

public class StudentResult {
	
	int total;
	int avg;
	
	void displayStudent(String name) {
		
		System.out.println("Name of the Student : "+name);
		
	}
	
	void calculateTotal(int m1, int m2, int m3) {
		
		total = m1 + m2 + m3;
		System.out.println("Total of the marks : "+total);
		
	}
	
	void calculateAverage(int m1, int m2, int m3) {
		
		avg = (m1+m2+m3)/3;
		System.out.println("Average of the Marks : "+avg);
		
	}

	void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		displayStudent(name);
		
		System.out.println("Enter marks : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		calculateTotal(m1,m2,m3);
		
		calculateAverage(m1,m2,m3);
		
		sc.close();

	}

}
