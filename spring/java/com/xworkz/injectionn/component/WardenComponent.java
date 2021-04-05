package com.xworkz.injectionn.component;

public class WardenComponent {
	private String wardenName;

	public WardenComponent(String wardenName) {
		super();
		System.out.println("Invoked WardenComponent, wardenName is: " + wardenName);
		this.wardenName = wardenName;
	}

	public void arrangeFood() {
		System.out.println("Warden arranging food");
	}
}
