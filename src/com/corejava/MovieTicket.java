package com.corejava;

public class MovieTicket {
	
	int ticketID;
	int scrnNo;
	int tcktPrice;
	String onlnBkngSts;
	int viewerAge;
	int noOfTckts;
	int phNo;
	float gstAmt;
	

	public static void main(String[] args) {
		
		MovieTicket mt = new MovieTicket();
		
		mt.ticketID = 101;
		mt.scrnNo = 2;
		mt.tcktPrice = 250;
		mt.onlnBkngSts = "Booked";
		mt.viewerAge = 21;
		mt.noOfTckts = 1;
		mt.phNo = 1234567890;
		mt.gstAmt = 150.35f;
		
		System.out.println("Ticket ID :              "+mt.ticketID);
		System.out.println("Screen No :              "+mt.scrnNo);
		System.out.println("Ticket Price :           "+mt.tcktPrice);
		System.out.println("Online Booking Status :  "+mt.onlnBkngSts);
		System.out.println("Viewer Age :             "+mt.viewerAge);
		System.out.println("No.of Tickets :          "+mt.noOfTckts);
		System.out.println("Phone Number :           "+mt.phNo);
		System.out.println("GST Amount :             "+mt.gstAmt);

	}

}
