package com.corejava;

public class CricketPlayer {
	
	static String teamName = "India";
	String playerName;
	int runs;

	public static void main(String[] args) {
		CricketPlayer p1 = new CricketPlayer();
		
		System.out.println("*********Player 1 Details*********");
		p1.playerName = "Mahendra Singh Dhoni";
		p1.runs = 5000;
		System.out.println("Team Name : "+teamName);
		System.out.println("Player Name : "+p1.playerName);
		System.out.println("Player Runs : "+p1.runs);
		
		CricketPlayer p2 = new CricketPlayer();
		
		System.out.println("*********Player 2 Details*********");
		p2.playerName = "Virat Kohli";
		p2.runs = 8000;
		System.out.println("Team Name : "+teamName);
		System.out.println("Player Name : "+p2.playerName);
		System.out.println("Player Runs : "+p2.runs);
		
		System.out.println("*****Static & Instance Variables Demonstration*****");
		System.out.println("Team Name : "+teamName);
		System.out.println("Team Name : "+CricketPlayer.teamName);
		System.out.println("Player1 Name : "+p1.playerName);
		System.out.println("Player2 Name : "+p2.playerName);
		System.out.println("Player1 Runs : "+p1.runs);
		System.out.println("Player2 Runs : "+p2.runs);

	}

}
