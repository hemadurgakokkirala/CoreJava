package com.corejava;

public class Student {
	
	int StudentID;
	String StudentName;
	String address;
	int age;

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.StudentID = 401;
		st1.StudentName = "Hema";
		st1.address = "Pippara";
		st1.age = 21;
		System.out.println("******Student 1 details******");
		System.out.println("Student ID : " + st1.StudentID);
		System.out.println("Student Name : " + st1.StudentName);
		System.out.println("Student Address : " + st1.address);
		System.out.println("Student Age : " + st1.age);
		
		Student st2 = new Student();
		st2.StudentID = 402;
		st2.StudentName = "Akshaya";
		st2.address = "Tpg";
		st2.age = 20;
		System.out.println("******Student 2 details******");
		System.out.println("Student ID : " + st2.StudentID);
		System.out.println("Student Name : " + st2.StudentName);
		System.out.println("Student Address : " + st2.address);
		System.out.println("Student Age : " + st2.age);
		
		System.out.println("\n******************Student Details*******************");
		System.out.println("ID\tName\t\tAddress\t\t\tAge");
		System.out.println("-----------------------------------------------------");
		System.out.print(st1.StudentID);
		System.out.print("\t"+st1.StudentName);
		System.out.print("\t\t"+st1.address);
		System.out.println("\t\t\t"+st1.age);
		System.out.print(st2.StudentID);
		System.out.print("\t"+st2.StudentName);
		System.out.print("\t\t"+st2.address);
		System.out.println("\t\t\t"+st2.age);

	}

}
