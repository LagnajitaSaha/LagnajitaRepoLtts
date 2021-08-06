package com.ltts;

import java.text.DecimalFormat;

public class ODIMatch extends Match {

	double reqRunrate;
	int balls;

	@Override
	public float calculateRunRate() {
		float remainingOver;
		float requiredRuns;
		float reqRunrate1;
		requiredRuns = (super.getTarget() - getCurrentscore());
		remainingOver = (this.calculateBalls() / 6);
		reqRunrate1 = requiredRuns / remainingOver;
		return reqRunrate1;
	}

	@Override
	public int calculateBalls() {

		balls = (50 - (int) super.getCurrentover().floatValue()) * 6;
		return balls;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		System.out.println("Need" + (super.getTarget() - getCurrentscore()) + " runs in" + balls + " balls");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Required Runrate:" + df.format(reqRunrate));

	}

}
