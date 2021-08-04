package com.ltts;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		
		String teamname="";
		String inningsname="";
		int runs;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the team name:");
		teamname=sc.nextLine();
		System.out.println("Enter session:");
		inningsname=sc.nextLine();
		System.out.println("Enter runs:");
		runs=sc.nextInt();
		if(runs<0)
			System.out.println("Invalid Input..");
		
		Innings obj =new Innings();
		obj.setTeamname(teamname);
		obj.setInningsname(inningsname);
		obj.setRuns(runs);
		
		obj.displayInningsDetails();

	}

}
