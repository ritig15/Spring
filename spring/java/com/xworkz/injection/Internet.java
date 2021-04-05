package com.xworkz.injection;

public class Internet {
	private float speed;

	public Internet() {
		System.out.println("Created Internet");
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public void connect() {
		System.out.println("Invoked connect in Internet");
	}
}
