package com.corejava;

public class MobileRecharge {
	
	void showPlanDetails() {
		System.out.println("\nCurrent Recharge Plan");
		System.out.println("Plan Name : Unlimited 299");
		System.out.println("Validity  : 28 Days");
		System.out.println("Data      : 1.5GB/Day");
		System.out.println("Calls     : Unlimited");
	}
	
	void recharge(double amount) {
		System.out.println("\nRecharge Successful!");
		System.out.println("Recharge Amount : ₹"+amount);
	}

	public static void main(String[] args) {
		MobileRecharge mr = new MobileRecharge();
		System.out.println("Main method started");
		mr.showPlanDetails();
		mr.recharge(299.0);
		System.out.println("Main method ended");
		
	}

}
