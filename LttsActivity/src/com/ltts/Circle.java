package com.ltts;

public class Circle extends Shape {

	@Override
	public void calculateArea(int value) {
		System.out.println("Area Of Circle is :" + (3.14 * value * value));

	}

}
