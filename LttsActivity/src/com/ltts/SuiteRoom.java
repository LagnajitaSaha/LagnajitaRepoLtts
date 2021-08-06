package com.ltts;

public class SuiteRoom extends HotelRoom {

	private Integer ratePerSqFeet;

	public SuiteRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}

	
	public Integer getRatePerSqFeet() {
		if(super.getHasWifi())
			return (this.ratePerSqFeet + 2) ;
		else
			return this.ratePerSqFeet;

	}
	
	
	
	
}
