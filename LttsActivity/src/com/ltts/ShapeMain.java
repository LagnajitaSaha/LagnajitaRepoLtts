package com.ltts;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String shapetype = "";
		int value;
			
		System.out.println("Circle\r\n" + "Square\r\n" + "Enter the shape\r\n" + "");
		shapetype=sc.nextLine();
		if (shapetype.equalsIgnoreCase("Circle")) {

			System.out.println("Enter the radius");
			value = Integer.parseInt(sc.nextLine());
			Circle obj = new Circle();
			obj.calculateArea(value);

		} else if (shapetype.equalsIgnoreCase("Square")) {
			System.out.println("Enter the side");
			value = Integer.parseInt(sc.nextLine());
			Square obj1 = new Square();
			obj1.calculateArea(value);

		}

	}

}
