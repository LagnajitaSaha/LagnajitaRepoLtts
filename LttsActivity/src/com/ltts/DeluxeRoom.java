package com.ltts;

public class DeluxeRoom  extends HotelRoom{
	
	protected 	Integer ratePerSqFeet;
	
	
	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	public Integer getRatePerSqFeet() {
		if(super.getHasWifi())
			return (this.ratePerSqFeet + 2) ;
		else
			return this.ratePerSqFeet;

	}
	
	



}
