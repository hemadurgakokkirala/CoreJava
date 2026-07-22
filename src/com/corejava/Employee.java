package com.corejava;

public class Employee {
	
	static String companyName;
	static String location;
	
	static {
		companyName = "HD Solutions";
		location = "Hyderabad";
	}

	String employeeName;
	int salary;
	float packages;
	
	{
        System.out.println("Instance Block Executed");
    }


	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		{
	        System.out.println("Instance Block Executed");
	    }
	
		System.out.println("**********Employee 1 Details **********");
		e1.employeeName = "Hema";
		e1.salary = 35000;
		e1.packages = 4.2f;
		
		System.out.println("Company Name : "+companyName);
		System.out.println("Location : "+location);
		System.out.println("Employee Name : "+e1.employeeName);
		System.out.println("Employee Salary : "+e1.salary);
		System.out.println("Employee Salary(PA) : "+e1.packages+"lakhs");
		
		System.out.println("\n**********Employee 2 Details **********");
		e2.employeeName = "Akshaya";
		e2.salary = 30000;
		e2.packages = 3.6f;
		
		System.out.println("Company Name : "+companyName);
		System.out.println("Location : "+location);
		System.out.println("Employee Name : "+e2.employeeName);
		System.out.println("Employee Salary : "+e2.salary);
		System.out.println("Employee Salary(PA) : "+e2.salary+"lakhs");
		
//		{
//	        System.out.println("Instance Block Executed");
//	    }
		
	}

}
