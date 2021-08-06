package com.ltts;

import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		int matchformat;
		double reqRunrate;
		int balls;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the match format\r\n" + "1.	ODI\r\n" + "2.	T20\r\n" + "3.	Test\r\n" + "");

		matchformat = Integer.parseInt(sc.nextLine());
		// System.out.println("Enter the Current score");

		if (matchformat == 1) {
			Match obj = new ODIMatch();
			System.out.println("Enter the Current score");
			obj.setCurrentscore(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the current Over");
			obj.setCurrentover(Float.parseFloat(sc.nextLine()));
			System.out.println("Enter the Target Score");
			obj.setTarget(Integer.parseInt(sc.nextLine()));
			System.out.println("Requirements:");
			balls = obj.calculateBalls();
			reqRunrate = obj.calculateRunRate();
			obj.display(reqRunrate, balls);

		} else if (matchformat == 2) {

			Match obj2 = new T20();
			System.out.println("Enter the Current score");
			obj2.setCurrentscore(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the current Over");
			obj2.setCurrentover(Float.parseFloat(sc.nextLine()));
			System.out.println("Enter the Target Score");
			obj2.setTarget(Integer.parseInt(sc.nextLine()));
			System.out.println("Requirements:");
			balls = obj2.calculateBalls();
			reqRunrate = obj2.calculateRunRate();
			obj2.display(reqRunrate, balls);

		}

	}
}