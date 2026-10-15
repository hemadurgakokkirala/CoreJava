package com.corejava;

import java.util.Scanner;

public class QuizAppplication {
	String subject;
	int totalQuestions;
	String timeLimit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizAppplication aq = new QuizAppplication();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject : ");
		aq.subject = sc.nextLine();
		System.out.println("Enter Total Questions : ");
		aq.totalQuestions = sc.nextInt();
		System.out.println("Enter Time Limit :");
		aq.timeLimit = sc.next();
		
		Quiz q = new Quiz();
		System.out.println("No-arg Constructor");

		Quiz q1 = new Quiz(aq.subject, aq.totalQuestions, aq.timeLimit);
		q1.display();

	}

}

class Quiz{
	String subject;
	int totalQuestions;
	String timeLimit;
	
	Quiz(){
		this("unknown");
		System.out.println("passes 1 variable data");
	}
	
	Quiz(String subject){
		this(subject,0);
		System.out.println("passes 2 variables data");
	}
	
	Quiz(String subject, int totalQuestions){
		this(subject,totalQuestions,"unknown");
		System.out.println("passes 3 variables data");
	}
	
	Quiz(String subject, int totalQuestions, String timeLimit){
		this.subject = subject;
		this.totalQuestions = totalQuestions;
		this.timeLimit = timeLimit;
		System.out.println("assigning data to local variables");
	}
	
	void display() {
		System.out.println("Subject : "+subject);
		System.out.println("Total Questions : "+totalQuestions);
		System.out.println("Time Limit : "+timeLimit);
	}
	
}
