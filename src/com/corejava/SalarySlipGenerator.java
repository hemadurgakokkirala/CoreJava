package com.corejava;

import java.util.Scanner;

public class SalarySlipGenerator {
	
	String employeeName;
	double basicSalary;
	double hra,da,grossSalary;
	
	void salarySlip(String employeeName, double basicSalary) {
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Basic Salary : "+basicSalary);
		hra = basicSalary * 0.20;
		da = basicSalary * 0.10;
		grossSalary = basicSalary+hra+da;
		System.out.println("HRA : "+hra);
		System.out.println("DA : "+da);
		System.out.println("Gross Salary : "+grossSalary);
	}

	void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		employeeName = sc.nextLine();
		System.out.println("Enter Salary : ");
		basicSalary = sc.nextDouble();

		salarySlip(employeeName, basicSalary);
		sc.close();
	}

}
