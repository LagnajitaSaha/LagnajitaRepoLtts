package com.ltts;

public abstract class Shape {

	private int value;

	public abstract void calculateArea(int value);

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}