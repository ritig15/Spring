package com.xworkz.washingmachine;

public class WashingMachine {
	private String companyName;
	private float capacity; // in kg
	Motor motor;
	Power pow;

	public WashingMachine(Motor motor, Power pow) {
		super();
		// System.out.println("Created WashingMachine");
		this.motor = motor;
		this.pow = pow;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public void wash() {
		if (pow.isOn()) {
			this.motor.rotate();
		}
	}

	public void displayMachineDetails() {
		System.out.println("*****************************");
		System.out.println("Displaying Machine details: ");
		System.out.println("Capacity (in kgs) is: " + this.getCapacity());
		System.out.println("Company Name: " + this.getCompanyName());
		System.out.println("*****************************");
	}
}
