package com.corejava;

import java.util.Scanner;

public class CricketPlayerStatistics {
	
	void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Name : ");
		String playerName = sc.nextLine();
		System.out.println("Enter Matched Played : ");
		int matchesPlayed = sc.nextInt();
		System.out.println("Enter Total Runs : ");
		int runs = sc.nextInt();
		
		CricketPlayers crckt = new CricketPlayers(playerName, matchesPlayed, runs);
		crckt.show();
		
		sc.close();
	}
	

}

class CricketPlayers {
	String playerName;
	int matchesPlayed;
	int runs;
	
	CricketPlayers(String playerName, int matchesPlayed, int runs){
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runs = runs;
	}
	
	void show() {
		
		float averageRuns = (float)(runs/matchesPlayed);
		
		System.out.println("Player Name : "+playerName);
		System.out.println("Matched pLayed : "+matchesPlayed);
		System.out.println("Toatal Runs : "+runs);
		System.out.println("Average Runs : "+averageRuns);
	}
	
}
