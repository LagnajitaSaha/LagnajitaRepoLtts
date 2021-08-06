package com.ltts;

public class DeluxeSeaViewRoom extends DeluxeRoom{

	public DeluxeSeaViewRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi,
			Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
		// TODO Auto-generated constructor stub
		super.ratePerSqFeet=12;
	}
	
	

}
