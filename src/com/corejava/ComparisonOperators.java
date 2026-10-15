package com.corejava;

public class ComparisonOperators {
//> < >= <= == !=
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 5;
		int c = 5;
		
		System.out.println("------- > , < -----");
		System.out.println(a>b);//7>5
		System.out.println(b>c);//5>5
//		System.out.println(a>c);//7>5
//		System.out.println(a<b);//7<5
		System.out.println(b<c);//5<5
		System.out.println(a<c);//7<5
		System.out.println(b>a);//5>7
		System.out.println(b<a);//5<7
//		System.out.println(c>a);//5>7
//		System.out.println(c>b);//5>5
//		System.out.println(c<a);//5<7
//		System.out.println(c<b);//5<5
		
		System.out.println("------- >= , <= -----");
//		System.out.println(a>=b);
//		System.out.println(b>=c);
		System.out.println(a>=c);
		System.out.println(a<=b);
//		System.out.println(b<=c);
//		System.out.println(a<=c);
//		System.out.println(b>=a);
//		System.out.println(b<=a);
		System.out.println(c>=a);
		System.out.println(c>=b);
		System.out.println(c<=a);
		System.out.println(c<=b);
		
		System.out.println("------- == , != -----");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		
		System.out.println(a!=b);
		System.out.println(b!=c);
		System.out.println(a!=c);

	}

}
