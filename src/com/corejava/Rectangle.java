package com.corejava;

public class Rectangle {
	
	float length;
	float breadth;
	float areaofrec;
	
	void CalculateofArea() {
		length = 15.34f;
		breadth = 4.4f;
		areaofrec = length * breadth;
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
		System.out.println("Area of Rectangle : "+areaofrec);
	}

	public static void main(String[] args) {
		
		Rectangle aor = new Rectangle();
		
		aor.CalculateofArea();
		

	}

}
