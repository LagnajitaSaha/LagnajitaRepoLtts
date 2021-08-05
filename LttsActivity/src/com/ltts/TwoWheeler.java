package com.ltts;

public class TwoWheeler extends Vehicle{
	private Boolean kickStartAvailable;
	public TwoWheeler()
	{
		
	}
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
			Boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	

	public void displayDetailInfo()
	{	
		System.out.println("---Detail Information---");
		if(this.getKickStartAvailable()==true)
		System.out.println("Kick Start Available:YES");
		else
		System.out.println("Kick Start Available:NO");	
		
	}
	

	
}
