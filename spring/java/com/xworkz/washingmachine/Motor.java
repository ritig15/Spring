package com.xworkz.washingmachine;

public class Motor {
	private int warrantyPeriod;

	public Motor(int warrantyPeriod) {
		super();
		// System.out.println("Created Motor");
		// System.out.println("Warranty Period is: " + warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}

	public void rotate() {
		System.out.println("Motor is rotating");

	}
}
