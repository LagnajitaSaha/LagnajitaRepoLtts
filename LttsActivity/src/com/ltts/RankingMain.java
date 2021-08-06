package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RankingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_of_Player;
		String name;
		int score;
		ArrayList<Ranking> alist = new ArrayList<Ranking>();
		System.out.println("Please provide the number of  players ");
		no_of_Player = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= no_of_Player; i++) {
			System.out.println("Enter the name of the player " + i);
			name = sc.nextLine();
			System.out.println("Enter the score of the player " + i);
			score = Integer.parseInt(sc.nextLine());
			alist.add(new Ranking(name, score));
		}

		Collections.sort(alist);
		System.out.println("Player Details by Score(High to Low) ");
		for (int k = 0; k < alist.size(); k++) {
			System.out.println((k + 1) + " " + alist.get(k).getName() + " " + alist.get(k).getScore());

		}

	}

}
