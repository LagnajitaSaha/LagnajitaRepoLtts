package com.ltts;

public class FourWheeler extends Vehicle{
	private String audioSystem ;
	private Integer numberOfDoors;
	public FourWheeler()
	{}
	public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
			String audioSystem, Integer numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System: "+this.getAudioSystem());
		System.out.println("Number of Doors: "+this.getNumberOfDoors());
		
	}
	


}
