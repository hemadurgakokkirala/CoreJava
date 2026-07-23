package com.corejava;

import java.util.Scanner;

public class ParameterizedConstructor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		float length = sc.nextFloat();
		System.out.println("Enter Breadth : ");
		float breadth = sc.nextFloat();
		
		Rectangle1 rec = new Rectangle1(length, breadth);
		rec.show();
		
		sc.close();
	}

}

class Rectangle1 {
	float breadth;
	float length;
	float area;
	
	Rectangle1(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	float areaofRec() {
		area = length * breadth;
		return area;
	}
	
	void show() {
//		area = areaofRec();
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
		System.out.println("Area of Rectangle : "+areaofRec());
	}
	
	
}