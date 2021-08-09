package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no_of_teams;
		Scanner sc = new Scanner(System.in);
		String name;
		Long numberOfMatches;

		ArrayList<Team> alist = new ArrayList<>();
		System.out.println("Enter number of teams:");
		no_of_teams = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= no_of_teams; i++) {
			if (i == 1)
				System.out.println("Enter team 1 detail");
			else if (i == 2)
				System.out.println("Enter team 2 detail");
			else if (i == 3)
				System.out.println("Enter team 3 detail");
			else
				System.out.println("Enter Another team  detail");
			System.out.println("Enter Name");
			name = sc.nextLine();
			System.out.println("Enter number of matches");
			numberOfMatches = Long.parseLong(sc.nextLine());

			Team obj = new Team(name, numberOfMatches);
			alist.add(obj);

		}

		Collections.sort(alist, Comparator.comparing(Team::getNumberOfMatches));

		System.out.println("Team list after sort by number of matches");
		Stream<Team> teamlist = alist.stream();

		teamlist.forEach(Team -> System.out.println(Team.getName() + "- " + Team.getNumberOfMatches()));

	}

}
