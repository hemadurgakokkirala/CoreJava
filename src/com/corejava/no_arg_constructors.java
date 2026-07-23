package com.corejava;

public class no_arg_constructors {
	
	no_arg_constructors(){
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		no_arg_constructors noarg = new no_arg_constructors();
		System.out.println(noarg);
		System.out.println("main method eded");

	}

}

class Student1 {
	String name;
	int rollNo;
	
	Student1() {
		System.out.println("Student Object created");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
	}
}

class car {
	String brand;
	double price;
	
	car(){
		brand = "Toyota";
		price = 1500000;
	}
	
	void display(){
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
	}
	
	public static void main(String[] args) {
		car c = new car();
		c.display();
	}
}

class employee {
	String employeeName;
	double salary;
	
	employee() {
		employeeName = "Hema Durga";
		salary = 1200000.00;
	}
	
	void show() {
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		employee e = new employee();
		e.show();
	}
}
