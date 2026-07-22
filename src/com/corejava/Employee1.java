package com.corejava;

public class Employee1 {
	
	@Override
	protected void finalize() {
		System.out.println("Object is eligible for Garbage Collection\nGarbage Collector Called");
	}

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1();
		System.out.println(e1);		
		
		e1 = null;
		
		System.gc();
//		System.out.println("------------------");
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
		

	}

}
