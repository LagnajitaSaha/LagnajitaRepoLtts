package com.ltts;

import java.util.Scanner;

public class CustomExceptionTestMain {

	static void invalidAgeRange(int player_age, String player_name) throws CustomException {
		if (player_age > 19) {
			System.out.println("Player name : " + player_name);
			System.out.println("Player age : " + player_age);
		} else
			throw new CustomException("InvalidAgeRangeException");

	}

	public static void main(String[] args) {
		String player_name;
		Integer player_age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name ");
		player_name = sc.nextLine();
		System.out.println("Enter the player age ");
		player_age = Integer.parseInt(sc.nextLine());
		try {
			invalidAgeRange(player_age, player_name);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
