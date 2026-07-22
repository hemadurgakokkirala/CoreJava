package com.corejava;

public class Employee2 {
	
	int employeeID;
	char employeeGrade;
	int salary;
	String permEmpSts;
	int empExp;
	int wrkgDays;
	int phNo;
	int bnsAmt;	

	public static void main(String[] args) {
		
		Employee2 emp = new Employee2();
		
		emp.employeeID = 1;
		emp.employeeGrade = 'A';
		emp.salary = 50000;
		emp.permEmpSts = "Full Time";
		emp.empExp = 5;
		emp.wrkgDays = 5;
		emp.phNo = 1234567890;
		emp.bnsAmt = 15000;
		
		System.out.println("Employee ID :               "+emp.employeeID);
		System.out.println("Employee Grade :            "+emp.employeeGrade);
		System.out.println("Employee Salary :           "+emp.salary);
		System.out.println("Employee Permanent Status : "+emp.permEmpSts);
		System.out.println("Employee Experience :       "+emp.empExp);
		System.out.println("Employee PhoneNumber :      "+emp.phNo);
		System.out.println("Employee Bonus Amount :     "+emp.bnsAmt);

	}

}
