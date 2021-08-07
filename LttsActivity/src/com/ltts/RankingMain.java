package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

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

		Stream<Ranking> filter_data = alist.stream();

		filter_data.forEach(withCounter(
				(i, Ranking) -> System.out.println("" + (i + 1) + " " + Ranking.getName() + " " + Ranking.getScore())));

	}

	public static <Ranking> Consumer<Ranking> withCounter(BiConsumer<Integer, Ranking> consumer) {
		AtomicInteger counter = new AtomicInteger(0);
		return item -> consumer.accept(counter.getAndIncrement(), item);
	}

}
