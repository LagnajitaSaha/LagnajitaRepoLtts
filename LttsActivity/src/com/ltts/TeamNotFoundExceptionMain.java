package com.ltts;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamNotFoundExceptionMain {

	public static void main(String[] args) {

		String expected_winner_team = "";
		String expected_runner_team = "";
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Chennai Super Kings");
		alist.add("Sun Risers Hyderabad");
		alist.add("Kings XI Punjab");
		alist.add("Kolkata Knight Riders");
		alist.add("Mumbai Indians");
		alist.add("Rajasthan Royals");
		alist.add("Royal Challengers Bangalore");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expected winner team of IPL Season 13");
		expected_winner_team = sc.nextLine();
		try {
			if (!alist.contains(expected_winner_team))
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");

		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}

		System.out.println("Enter the expected runner Team of IPL Season 13");
		expected_runner_team = sc.nextLine();
		try {
			if (!alist.contains(expected_runner_team))
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");

		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}

		System.out.println("Expected IPL Season 13 winner: " + expected_winner_team);
		System.out.println("Expected IPL Season 13 runner: " + expected_runner_team);

	}

}
