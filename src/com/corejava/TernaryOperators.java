package com.corejava;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		String result = (a > 0)?"Positive":"Negative";
		System.out.println(result);
		
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		String grade = (marks>=90)?"A":
					 (marks>=75)?"B":
						 (marks>=60)?"C":
							 (marks>=40)?"D":"Fail";
		System.out.println(grade);
		
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		String vowcon = (ch == 'a')?"Vowel":
			            (ch == 'e')?"Vowel":
			            	(ch == 'i')?"Vowel":
			            	(ch == 'o')?"Vowel":
			            	(ch == 'u')?"Vowel":"Consonant";
		System.out.println(vowcon);
	}

}
