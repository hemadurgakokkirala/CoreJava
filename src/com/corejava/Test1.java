package com.corejava;

public class Test1 {
	
	static int a = 10;
	static String name = "Hema";
	
	int b = 20;
	String name1 = "Durga";

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(name);
		
		Test1 t = new Test1();
		t.b = 30;
		t.name1 = "Bujji";
		
		System.out.println(t.b);
		// System.out.println(t.name1);		

	}

}
