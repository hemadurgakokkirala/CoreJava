package com.corejava;

import java.util.Scanner;

public class MethodsTest2 {
	
	//Student Details
	void getAge(int age) {
		
		System.out.println("Age of the Student : "+age);
	}
	
	void getFullName(String fname, String lname) {
		System.out.println("Full name : "+fname+" "+lname);
	}
	
	void getStudentID(int stdId) {
		System.out.println("Student ID : "+stdId);
	}
	
	void getclgBranch(String clgbranch) {
		System.out.println("Student Branch : "+clgbranch);
	}
	
	void getCollegeName(String clgName) {
		System.out.println("College Name : "+clgName);
	}
	
	void getCGPA(float cgpa) {
		System.out.println("CGPA : "+cgpa);
	}
	
	void getSection(char sec) {
		System.out.println("Section : "+sec);
	}
	
	void getAttendance(float att) {
		System.out.println("Attendance : "+att+"%");
	}
	
	void getSemester(int sem) {
		System.out.println("Semester : "+sem);
	}
	
	void getPhoneNumber(long phNo) {
		System.out.println("Phone Number : "+phNo);
	}
	
	//Product Details
	void getProductID(int pdtId) {
		System.out.println("Product ID : "+pdtId);
	}
	
	void getProductName(String pdtName) {
		System.out.println("Product Name : "+pdtName);
	}

	void getPrice(double pdtPrice) {
		System.out.println("Product Price : "+pdtPrice);
	}
	
	void getQuantity(int quantity) {
		System.out.println("Quantity : "+quantity);
	}
	
	void getDiscount(int discount) {
		System.out.println("Product Discount : "+discount+"%");
	}
	
	void getCategory(String category) {
		System.out.println("Product Category : "+category);
	}
	
	void getBrand(String brand) {
		System.out.println("Product Brand : "+brand);
	}
	
	void getRating(float rating) {
		System.out.println("Product Rating : "+rating);
	}
	
	void getStock(boolean available) {
		System.out.println("Product Stock : "+available);
	}
	
	void getColor(String color) {
		System.out.println("Product Color : "+color);
	}
	
	//Bank Details
	void getAccountNumber(long accountNo) {
		System.out.println("Bank Account Number : "+accountNo);
	}
	
	void getAccountHolder(String holderName) {
		System.out.println("Account Holder Name : "+holderName);
	}
	
	void getBalance(double balance) {
		System.out.println("Balance : "+balance);
	}
	
	void getBranchName(String bankBranch) {
		System.out.println("Bank Branch : "+bankBranch);
	}
	
	void getAccountType(String type) {
		System.out.println("Account Type : "+type);
	}
	
	void getNominee(String nominee) {
		System.out.println("Nominee Name : "+nominee);
	}
	
	void getMobileNumber(long mobile) {
		System.out.println("Mobile Number : "+mobile);
	}
	
	void getEmail(String email) {
		System.out.println("Email : "+email);
	}
	
	//Mixed Practice
	void displayMovie(String movieName, float movieRating) {
		System.out.println("----> Movie Details");
		System.out.println("Movie Name : "+movieName+"\nRating : "+movieRating);
	}
	
	void displayBook(String  title, String author) {
		System.out.println("----> Book Details");
		System.out.println("Book Name : "+title+"\nAuthor : "+author);
	}
	
	void displayLaptop(String lptpBrand, int ram, double lptpPrice) {
		System.out.println("----> Laptop Details");
		System.out.println("Laptop Name : "+lptpBrand+"\nRAM : "+ram+"GB"+"\nLaptop Price : "+lptpPrice);
	}
	
	void displayCricketer(String cricName, int runs) {
		System.out.println("----> Cricketer Details");
		System.out.println("Cricketer Name : "+cricName+"\nRuns : "+runs);
	}
	
	void displayHospital(String patientName, int ptAge) {
		System.out.println("----> Patient Details");
		System.out.println("Patient Name : "+patientName+"\nAge : "+ptAge);
	}
	
	void displayBus(String busNumber, String route) {
		System.out.println("----> Bus Details");
		System.out.println("Bus Number : "+busNumber+"\nRoute : "+route);
	}
	
	void displayCourse(String courseName, int duration) {
		System.out.println("----> Course Details");
		System.out.println("Course Name : "+courseName+"\nDuration : "+duration+" months");
	}
	
	void displayWeather(String city, float temperature) {
		System.out.println("----> Weather Details");
		System.out.println("City : "+city+"\nTemperature : "+temperature+"℃");
	}
	
	void displayPassport(String psprtName, String psprtNumber) {
		System.out.println("----> Passport Details");
		System.out.println("Passport Holder Name : "+psprtName+"\nPassport Number : "+psprtNumber);
	}
	
	void getNationality(String nationality) {
		System.out.println("Nationality : "+nationality);
	}
	
	void getBloodGroup(String bloodGroup) {
		System.out.println("Blood Group : "+bloodGroup);
	}
	
	void getDateofBirth(String dob) {
		System.out.println("Date of Birth : "+dob);
	}
	
	void getHeightAndWeight(float height, float weight) {
		System.out.println("Height (inches) : "+height+"\nWeight (kg): "+weight);
	}
	
	void getHobby(String hobby) {
		System.out.println("Hobby : "+hobby);
	}
	
	void getFavs(String favColor, String favFood) {
		System.out.println("Favourite Color : "+favColor+"\nFavourite Food : "+favFood);
	}
	
	void getMartialStatus(boolean married) {
		System.out.println("Married Status : "+married);
	}
	
	void getPinCode(int pinCode) {
		System.out.println("Pin Code : "+pinCode);
	}
	
	void getCountryAndState(String country, String state) {
		System.out.println("Country : "+country+"\nState : "+state);
	}
	void displayMusicAlbum(String albumName, String singer, String songs) {
		System.out.println("----> Music Album Details");
		System.out.println("Album Name : "+albumName+"\nSinger : "+singer+"\nSongs : "+songs);
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Student Details---");
		//Student Age
		System.out.print("Enter the age of the student : ");
		int age = sc.nextInt();
		getAge(age);
		
		//Student Full Name
		sc.nextLine();
		System.out.print("Enter First Name : ");
		String fname = sc.nextLine();
		System.out.print("Enter Last Name : ");
		String lname = sc.nextLine();
		getFullName(fname, lname);
		
		//Student ID
		System.out.print("Enter Student ID : ");
		int stdId = sc.nextInt();
		getStudentID(stdId);
		
		//Student Branch
		System.out.print("Enter Student Branch : ");
		sc.nextLine();
		String clgbranch = sc.nextLine();
		getclgBranch(clgbranch);
		
		//College Name
		System.out.print("Enter College Name : ");
		String clgName = sc.nextLine();
		getCollegeName(clgName);
		
		//CGPA
		System.out.print("Enter CGPA : ");
		float cgpa = sc.nextFloat();
		getCGPA(cgpa);
		
		//Section
		System.out.print("Enter Section : ");
		char sec = sc.next().charAt(0);
		getSection(sec);
		
		//Attendance
		System.out.print("Enter Attendance : ");
		float att = sc.nextFloat();
		getAttendance(att);
		
		//Semester
		System.out.print("Enter Semester : ");
		int sem = sc.nextInt();
		getSemester(sem);
		
		//Phone Number
		System.out.print("Enter Phone Number : ");
		long phNo = sc.nextLong();
		getPhoneNumber(phNo);
		
		System.out.println("\n---Product Details---");
		//Product ID
		System.out.print("Enter Product ID : ");
		int pdtId = sc.nextInt();
		getProductID(pdtId);
		
		//Product Name
		System.out.print("Enter Product Name : ");
		sc.nextLine();
		String pdtName = sc.nextLine();
		getProductName(pdtName);
		
		//Product Price
		System.out.print("Enter Product Price : ");
		double pdtPrice = sc.nextDouble();
		getPrice(pdtPrice);
		
		//Product Quantity
		System.out.print("Enter product Quantity : ");
		int quantity = sc.nextInt();
		getQuantity(quantity);
		
		//Product Discount
		System.out.print("Enter Product Discount : ");
		int discount = sc.nextInt();
		getDiscount(discount);
		
		//Product Category
		System.out.print("Enter Product Category : ");
		sc.nextLine();
		String category = sc.nextLine();
		getCategory(category);
		
		//Product Brand
		System.out.print("Enter Product Brand : ");
		String brand = sc.nextLine();
		getBrand(brand);
		
		//Product Rating
		System.out.print("Enter Product Rating : ");
		float rating = sc.nextFloat();
		getRating(rating);
		
		//Product Stock
		System.out.print("Enter Product Stock (true/false) : ");
		boolean available = sc.nextBoolean();
		getStock(available);
		
		//Product Color
		System.out.print("Enter Product Color : ");
		sc.nextLine();
		String color = sc.nextLine();
		getColor(color);
		
		System.out.println("\n---Bank Details---");
		//Bank Account Number
		System.out.print("Enter Account Number : ");
		long accountNo = sc.nextLong();
		getAccountNumber(accountNo);
		
		//Holder Name
		System.out.print("Enter Holder Name : ");
		sc.nextLine();
		String holderName = sc.nextLine();
		getAccountHolder(holderName);
		
		//Balance
		System.out.print("Enter Balance : ");
		double balance = sc.nextDouble();
		getBalance(balance);
		
		//Bank Branch
		System.out.print("Enter Bank Branch : ");
		sc.nextLine();
		String bankBranch = sc.nextLine();
		getBranchName(bankBranch);
		
		//Account Type
		System.out.print("Enter Account Type : ");
		String type = sc.nextLine();
		getAccountType(type);
		
		//Nominee Name
		System.out.print("Enter Nominee Name : ");
		String nominee = sc.nextLine();
		getNominee(nominee);
		
		//Mobile Number
		System.out.print("Enter Mobile Number : ");
		long mobile = sc.nextLong();
		getMobileNumber(mobile);
		
		//Email
		System.out.print("Enter Email : ");
		sc.nextLine();
		String email = sc.nextLine();
		getEmail(email);
		
		//Mixed Practice
		System.out.println("\n---Multiple Details---");
		System.out.print("Enter Movie Name : ");
		String movieName = sc.nextLine();
		System.out.print("Enter Rating : ");
		float movieRating = sc.nextFloat();
		displayMovie(movieName, movieRating);
		
		System.out.print("\nEnter Book Name : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("Enter Author : ");
		String author = sc.nextLine();
		displayBook(title, author);
		
		System.out.print("\nEnter Laptop Name : ");
		String lptpBrand = sc.nextLine();
		System.out.print("Enter RAM : ");
		int ram = sc.nextInt();
		System.out.print("Enter Price : ");
		double lptpPrice = sc.nextDouble();
		displayLaptop(lptpBrand, ram, lptpPrice);
		
		System.out.print("\nEnter Cricketer Name : ");
		sc.nextLine();
		String cricName = sc.nextLine();
		System.out.print("Enter Runs : ");
		int runs = sc.nextInt();
		displayCricketer(cricName, runs);
		
		System.out.print("\nEnter Patient Name : ");
		sc.nextLine();
		String patientName = sc.nextLine();
		System.out.print("Enter Age : ");
		int ptAge = sc.nextInt();
		displayHospital(patientName, ptAge);
		
		System.out.print("\nEnter Bus Number : ");
		sc.nextLine();
		String busNumber = sc.nextLine();
		System.out.print("Enter Route : ");
		String route = sc.nextLine();
		displayBus(busNumber, route);
		
		System.out.print("\nEnter Course Name : ");
		String courseName = sc.nextLine();
		System.out.print("Enter Duration : ");
		int duration = sc.nextInt();
		displayCourse(courseName, duration);
		
		System.out.print("\nEnter City : ");
		sc.nextLine();
		String city = sc.nextLine();
		System.out.print("Enter Temperature : ");
		float temperature = sc.nextFloat();
		displayWeather(city, temperature);
		
		System.out.print("\nEnter Passport Holder Name : ");
		sc.nextLine();
		String psprtName = sc.nextLine();
		System.out.print("Enter Passport Number : ");
		String psprtNumber = sc.nextLine();
		displayPassport(psprtName, psprtNumber);
		
		System.out.print("\nEnter Nationality : ");
		String nationality = sc.nextLine();
		getNationality(nationality);
		
		System.out.print("\nEnter Blood Group : ");
		String bloodGroup = sc.nextLine();
		getBloodGroup(bloodGroup);
		
		System.out.print("\nEnter Date of Birth : ");
		String dob = sc.nextLine();
		getDateofBirth(dob);
		
		System.out.print("\nEnter Height : ");
		float height = sc.nextFloat();
		System.out.print("Enter Weight : ");
		float weight = sc.nextFloat();
		getHeightAndWeight(height, weight);
		
		System.out.print("\nEnter Hobby : ");
		sc.nextLine();
		String hobby = sc.nextLine();
		getHobby(hobby);
		
		System.out.print("\nEnter Favourite Color : ");
		String favColor = sc.nextLine();
		System.out.print("Enter Favourite Food : ");
		String favFood = sc.nextLine();
		getFavs(favColor, favFood);
		
		System.out.print("\nEnter Martial Status (true/false) : ");
		boolean married = sc.nextBoolean();
		getMartialStatus(married);
		
		System.out.print("\nEnter Pin Code : ");
		int pinCode = sc.nextInt();
		getPinCode(pinCode);
		
		System.out.print("\nEnter Country : ");
		sc.nextLine();
		String country = sc.nextLine();
		System.out.print("Enter State : ");
		String state = sc.nextLine();
		getCountryAndState(country, state);
		
		System.out.print("\nEnter Music Album Name : ");
		String albumName = sc.nextLine();
		System.out.print("Enter Singer : ");
		String singer = sc.nextLine();
		System.out.print("Enter Songs : ");
		String songs = sc.nextLine();
		displayMusicAlbum(albumName, singer, songs);
		
		sc.close();

	}

}
