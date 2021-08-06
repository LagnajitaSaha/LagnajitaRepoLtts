package com.ltts;

public abstract class Match {
	
	private int currentscore;
	private Float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public Float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(Float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}

	
	public abstract	float calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunrate, int balls);
	
}
