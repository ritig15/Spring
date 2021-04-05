package com.xworkz.injectionn.component;

public class PGComponent {
	private String ownerName;

	public PGComponent(WardenComponent warden) {
		System.out.println("Invoked PGComponent");
		warden.arrangeFood();
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		System.out.println("Setting ownerName: " + ownerName);
		this.ownerName = ownerName;
	}

	public void serveFood() {
		System.out.println("PG Serving Food");
	}
}
