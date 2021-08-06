package com.ltts;

import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Integer roomtype;
		String hotelName;
		Integer numberOfSqFeet;
		Boolean hasTV;
		Boolean hasWifi;
		System.out.println("Hotel Tariff Calculator\r\n"
				+ "1. Deluxe Room\r\n"
				+ "2. Deluxe AC Room\r\n"
				+ "3. Suite AC Room\r\n"
				+ "Select Room Type:\r\n"
				+ "");
		
		roomtype = Integer.parseInt(sc.nextLine());
		System.out.println("Hotel Name:");
		hotelName=sc.nextLine();
		System.out.println("Room Square Feet Area:");
		numberOfSqFeet=Integer.parseInt(sc.nextLine());
		System.out.println("Room has TV (yes/no):");
		if(sc.nextLine().equalsIgnoreCase("yes"))
			hasTV=true;
		else
			hasTV=false;
		System.out.println("Room has Wifi (yes/no:");
		if(sc.nextLine().equalsIgnoreCase("yes"))
			hasWifi=true;
		else
			hasWifi=false;
		
		if(roomtype==1)
		{
			DeluxeRoom obj =new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi, null);
				obj.getRatePerSqFeet();
				Integer cost=obj.calculateTariff();
				
				System.out.println("Room Tariff per day is:"+cost);
				
		}
		
		else if(roomtype==2)
		{
			
			DeluxeSeaViewRoom obj1=new DeluxeSeaViewRoom(hotelName, numberOfSqFeet, hasTV, hasWifi, null);
			Integer cost=obj1.calculateTariff();
			
			System.out.println("Room Tariff per day is:"+cost);
			
		}

		else if(roomtype==3)
		{
			
			SuiteRoom obj2= new SuiteRoom(hotelName, numberOfSqFeet, hasTV, hasWifi, null);
			obj2.getRatePerSqFeet();
			Integer cost=obj2.calculateTariff();
			
			System.out.println("Room Tariff per day is:"+cost);
		
		
		}
		}

}
