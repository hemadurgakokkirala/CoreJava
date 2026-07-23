package com.corejava;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Student4 s1 =  new Student4();
		System.out.println(s1);
		Student4 s2 = new Student4("Hema");
		System.out.println(s2);
		Student4 s3 = new Student4("Hema",21);
		System.out.println(s3);
	}

}

class Student4 {
	
	Student4(){
		System.out.println("Constructed 1 is called");
	}
	
	Student4(String name){
		System.out.println("Constructed 2 is called");
	}
	
	Student4(String name, int age){
		System.out.println("Constructed 3 is called");
	}
}
