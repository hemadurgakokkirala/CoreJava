package com.corejava;

public class UnaryOperators {
//+ - ++ --
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 9;
		
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(+b);
		System.out.println(-b);
		System.out.println(a++);//7-->8
		System.out.println(++a);//9
		System.out.println(b--);//9-->8
		System.out.println(--b);//7
		System.out.println(++b);//8
		System.out.println(--a);//8
		System.out.println(++a);//9
		
		System.out.println(a+b);//17
		System.out.println(a-b);//1

	}

}
