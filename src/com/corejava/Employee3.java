package com.corejava;

import java.util.Scanner;

public class Employee3 {
	int empId;
	String empName;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee3() {
		System.out.println("No-arg constructor");
	}
	
	public Employee3(Employee3 e) {
		System.out.println("Parameterized Constructor");
		this.empId = e.empId;
		this.empName = e.empName;
		this.salary = e.salary;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e = new Employee3();
		e.empId = 1;
		e.empName = "Hema";
		e.salary = 25000.00;
		System.out.println("Employee 1");
		e.display();
		
		Employee3 e1 = new Employee3(e);
		System.out.println("Employee 2");
		e1.incrementSalary(10000.00);
		e1.empName = "Durga";
		e1.display();
			

	}
	
	void incrementSalary(double amount) {
		this.salary += amount;
	}
	
	void display() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+salary);	
	}

}
