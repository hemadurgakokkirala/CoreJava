package com.corejava;

public class StudentAdmission {
	int id;
	String name;
	String course;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentAdmission s = new StudentAdmission();
		s.show();
		
		StudentAdmission s1 = new StudentAdmission(27);
		s1.show();
		
		StudentAdmission s2 = new StudentAdmission(27,"Hema");
		s2.show();
		
		StudentAdmission s3 = new StudentAdmission(27,"Hema");
		s3.show();
		
		StudentAdmission s4 = new StudentAdmission(27,"Hema","JFS");
		s4.show();

	}
	
	void show() {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Course Name : "+course);
		System.out.println("*************************"
				+ "");
	}
	
	public StudentAdmission(){
		System.out.println("No-arg constructor");
	}
	
	public StudentAdmission(int id){
		this(id,"unknown");
	}
	
	public StudentAdmission(int id, String name){
		this(id,name,"JFS");
	}
	
	public StudentAdmission(int id, String name, String course){
		this.id = id;
		this.name = name;
		this.course = course;
	}

}