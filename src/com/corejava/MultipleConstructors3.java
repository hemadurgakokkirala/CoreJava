package com.corejava;

import java.util.Scanner;

public class MultipleConstructors3 {

	public static void main(String[] args) {
		
		circle c1 = new circle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		int radius = sc.nextInt();
		
		
		circle c2 = new circle(radius);
		sc.close();

	}

}

class circle {
	
	int area;
	
	circle(){
		System.out.println("no argumnets circle constructor");
	}
	
	circle(int radius){
		area = radius * radius;
		System.out.println("Area of Circle : "+area);
	}
}
