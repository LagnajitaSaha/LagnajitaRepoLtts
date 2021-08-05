package com.ltts;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		int vehicletype;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Four Wheeler\r\n" + "2.Two Wheeler\r\n" + "Enter Vehicle Type:\r\n" + "");
		vehicletype = Integer.parseInt(sc.nextLine());

		if (vehicletype == 1) {
			FourWheeler obj1 = new FourWheeler();
			System.out.println("Vehicle Make:");
			obj1.setMake(sc.nextLine());

			System.out.println("Vehicle Number:");
			obj1.setVehicleNumber(sc.nextLine());
			System.out.println("Fuel Type:\r\n" + "1.Petrol\r\n" + "2.Diesel\r\n" + "");
			if (Integer.parseInt(sc.nextLine()) == 1)
				obj1.setFuelType("Petrol");
			else
				obj1.setFuelType("Diesel");

			System.out.println("Fuel Capacity:");

			obj1.setFuelCapacity(Integer.parseInt(sc.nextLine()));
			System.out.println("Engine CC:");
			obj1.setCc(Integer.parseInt(sc.nextLine()));

			System.out.println("Audio System:");
			obj1.setAudioSystem(sc.nextLine());
			System.out.println("Number of Doors:");
			obj1.setNumberOfDoors(Integer.parseInt(sc.nextLine()));

			obj1.displayMake();
			obj1.displayBasicInfo();
			obj1.displayDetailInfo();

		} else {

			TwoWheeler obj2 = new TwoWheeler();
			System.out.println("Vehicle Make:");
			obj2.setMake(sc.nextLine());

			System.out.println("Vehicle Number:");
			obj2.setVehicleNumber(sc.nextLine());
			System.out.println("Fuel Type:\r\n" + "1.Petrol\r\n" + "2.Diesel\r\n" + "");
			if (Integer.parseInt(sc.nextLine()) == 1)
				obj2.setFuelType("Petrol");
			else
				obj2.setFuelType("Diesel");

			System.out.println("Fuel Capacity:");

			obj2.setFuelCapacity(Integer.parseInt(sc.nextLine()));
			System.out.println("Engine CC:");
			obj2.setCc(Integer.parseInt(sc.nextLine()));

			System.out.println("Kick Start Available:");
			if (sc.nextLine().equalsIgnoreCase("yes"))
				obj2.setKickStartAvailable(true);
			else
				obj2.setKickStartAvailable(false);
			obj2.displayMake();
			obj2.displayBasicInfo();
			obj2.displayDetailInfo();

		}

	}

}
