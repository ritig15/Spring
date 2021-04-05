package com.xworkz.spring.component;

public class InsuranceComponent {
	public InsuranceComponent() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	public String policyName() {
		System.out.println("Invoked policyName");
		return "JeevanAnand"; 
	}
}
