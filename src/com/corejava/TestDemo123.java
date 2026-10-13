package com.corejava;

import java.util.Scanner;

public class TestDemo123 {
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo123 td = new TestDemo123();
		Student123 st = new Student123();
		System.out.println("Object Created and Constructor Called");
		
		Car c = new Car();
		System.out.println("Car Constructor initialized");
		c.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		td.name = sc.nextLine();
		System.out.println("Enter age : ");
		td.age = sc.nextInt();
		System.out.println("Enter Salary : ");
		td.salary = sc.nextDouble();
		emp e = new emp(td.name, td.age, td.salary);
		e.display();

	}
}

class Student123 {
	Student123(){
		System.out.println("No arg Constructor");
	}
}

class Car {
	String brand;
	Car(){
		brand = "Toyato";
	}
	void display() {
		System.out.println("Car : "+brand);
	}
}

class emp {
	String name;
	int age;
	double salary;
	emp(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);	
	}
}
