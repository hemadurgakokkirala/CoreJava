package com.corejava;

public class MyInfo {
	
	void getName(String fname, String lname) {
		System.out.println("My name is "+ fname +" "+ lname);
	}
	
	void getInstituteName(String clgname) {
		System.out.println("My Institue Name : "+clgname);
	}
	
	void getplace(String city, String state) {
		System.out.println("City : "+ city +"\nState : "+ state);
	}
	
	void favSubject(String subj) {
		System.out.println("My favourite Subject : "+subj);
	}
	
	void todayDate(String date) {
		System.out.println("Today's Date : "+date);
	}
	
	void message() {
		System.out.println("HELLO ! Welcome to my WORLD:)");
	}
	
	void employeeDetails(String empName, int empID, String desgn) {
		System.out.println("Employee Name : "+empName+"\n\tEmployee ID : "+empID+"\n\tDesignation : "+desgn);
	}
	
	void productDetails(String pdtType, int pdtID, String pdtName) {
		System.out.println("Product Type : "+pdtType+"\n\tProduct ID : "+pdtID+"\n\tProductName : "+pdtName);
	}
	
	void studentMarks(int java, int database) {
		System.out.println("Java Marks : "+java+"\nDatabase Marks : "+database);
	}
	
	void mutiplicationTable(int num) {
		int temp = num;
		System.out.println("---Multiplication Table---");
		for(int i=1; i<=10; i++) {
			num = temp * i;
			System.out.println(temp+" * "+i+" = "+num);
		}
	}

	void main(String[] args) {
		System.out.println("main method started");
		getName("Hema Durga","K");
		getInstituteName("Vcube");
		getplace("Chandanagar","Hyderabad");
		favSubject("Java");
		todayDate("14-07-2026");
		message();
		employeeDetails("Hema Durga K",024,"Trainee");
		productDetails("Mobile",101,"iQOO Z6 Lite 5G");
		studentMarks(70,75);
		mutiplicationTable(2);
		System.out.println("main method ended");

	}

}
