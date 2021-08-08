package com.ltts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class DisplayTeamMain {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		no = Integer.parseInt(sc.nextLine());

		Map<String, String> map = new HashMap<>();
		Map<String, List<Player>> map1 = new TreeMap<>();

		for (int i = 0; i < no; i++) {
			String input = sc.nextLine();

			String arr[] = input.split("\\|");
			String curr = arr[0];

			if ((map.containsKey(curr))) {
				String Playerlist = map.get(curr);

				map.put(curr, Playerlist + "," + arr[1]);

			} else {

				map.put(curr, arr[1]);

			}

		}

		System.out.println("Team and Players in ascending order ");

		Set<String> keys = map.keySet();
		keys.stream().forEach(team -> {
			Team_Comparable obj2 = null;
			List<Player> alist = new ArrayList<>();
			obj2 = new Team_Comparable(team);

			obj2.addPlayer(map.get(team));

			alist = obj2.getPlayerList();
			map1.put(team, alist);

		});

		Set<String> keys1 = map1.keySet();
		keys1.stream().forEach(s -> {

			System.out.println(s); // for better understanding
			List<Player> list = map1.get(s);
			Stream<Player> r = list.stream();
			r.forEach(players ->

			System.out.println("--" + players.getName()));

		});

	}

}
