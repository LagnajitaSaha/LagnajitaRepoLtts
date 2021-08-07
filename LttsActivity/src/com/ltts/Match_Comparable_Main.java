package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Match_Comparable_Main {

	public static void main(String[] args) {
		int no_of_matches;
		String matchDate;
		String teamOne;
		String teamTwo;
		Scanner sc = new Scanner(System.in);
		ArrayList<Match_Comparable> alist = new ArrayList<Match_Comparable>();
		System.out.println("Enter the number of matches  ");
		no_of_matches = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= no_of_matches; i++) {
			System.out.println("Enter  match date in (MM-dd-yyyy) ");
			matchDate = sc.nextLine();
			System.out.println("Enter Team 1 ");
			teamOne = sc.nextLine();
			System.out.println("Enter Team 2 ");
			teamTwo = sc.nextLine();

			alist.add(new Match_Comparable(matchDate, teamOne, teamTwo));
		}
		Collections.sort(alist);
		System.out.println("Match Details ");
		Stream<Match_Comparable> filtered_data = alist.stream();
		filtered_data.forEach(
				Match_Comparable -> System.out.println("Team 1 " + Match_Comparable.getTeamOne() + "\r\n" + "Team 2 "
						+ Match_Comparable.getTeamTwo() + "\r\n" + "Match held on " + Match_Comparable.getMatchDate())

		);

	}

}
