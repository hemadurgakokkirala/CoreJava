package com.corejava;

public class Cricketers {
	String cricName;
	int cricjno;
	String iplteam;
	String nickname;
	double runs;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketers c = new Cricketers();
		c.show();
		
		Cricketers c1 = new Cricketers("MSD",07);
		c1.show();
		
		Cricketers c2 = new Cricketers("VK",18,"RCB");
		c2.show();
		
		Cricketers c3 = new Cricketers("Rohit",45,"MI","Shana");
		c3.show();
		
		Cricketers c4 = new Cricketers("Sachin",10,"MI","God",15000.00);
		c4.show();
	}
	
	void show() {
		System.out.println("Cricketer Name : "+cricName);
		System.out.println("Cricketer Jersey Number : "+cricjno);
		System.out.println("Cricketer IPL Team : "+iplteam);
		System.out.println("Crciketer Nickname : "+nickname);
		System.out.println("Total Runs : "+runs);
		System.out.println("*************************************");
	}

	public Cricketers(String cricName, int cricjno, String iplteam, String nickname, double runs) {
		this.cricName = cricName;
		this.cricjno = cricjno;
		this.iplteam = iplteam;
		this.nickname = nickname;
		this.runs = runs;
	}

	public Cricketers(String cricName, int cricjno, String iplteam, String nickname) {
		this(cricName,cricjno,iplteam,nickname,12000.00);
	}

	public Cricketers(String cricName, int cricjno, String iplteam) {
		this(cricName,cricjno,iplteam,"Thala");
	}

	public Cricketers(String cricName, int cricjno) {
		this(cricName,cricjno,"CSK");
	}

	public Cricketers() {
		this("unknown",0);
		System.out.println("no-arg constructor !");
		
	}

}
