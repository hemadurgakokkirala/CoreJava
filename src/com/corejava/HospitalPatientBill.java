package com.corejava;

import java.util.Scanner;

public class HospitalPatientBill {
	String patientName;
	int age;
	double roomCharge;
	int noOfDaysAdmitted;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalPatientBill bill = new HospitalPatientBill();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Name : ");
		bill.patientName = sc.nextLine();
		System.out.println("Enter Patient Age : ");
		bill.age = sc.nextInt();
		System.out.println("Enter Room Charge : ");
		bill.roomCharge = sc.nextDouble();
		System.out.println("Enter Number of Days Admitted : ");
		bill.noOfDaysAdmitted = sc.nextInt();
		
		Patient p = new Patient(bill.patientName,bill.age,bill.roomCharge,bill.noOfDaysAdmitted);
		p.display();
		
		sc.close();
		

	}

}

class Patient {
	String patientName;
	int age;
	double roomCharge;
	int noOfDaysAdmitted;
	
	Patient(String patientName, int age, double roomCharge, int noOfDaysAdmitted){
		this.patientName = patientName;
		this.age = age;
		this.roomCharge = roomCharge;
		this.noOfDaysAdmitted = noOfDaysAdmitted;
	}
	
	void display() {
		
		double totalBill = roomCharge * noOfDaysAdmitted; 
		
		System.out.println("Patient Name            : "+patientName);
		System.out.println("Patient Age             : "+age);
		System.out.println("Room Charge Per Day     : "+roomCharge);
		System.out.println("Number of Days Admitted : "+noOfDaysAdmitted);
		System.out.println("Total Hospital Bill     : "+totalBill);
	}
}
