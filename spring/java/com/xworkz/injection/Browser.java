package com.xworkz.injection;

public class Browser {
	public Browser(Internet internet) { //Constructor Injection
		System.out.println("Created Browser");
		internet.connect();
		System.out.println("Speed: " + internet.getSpeed());
	}

	public void surfing() {
		System.out.println("Invoked surfing in Browser");
	}
}
