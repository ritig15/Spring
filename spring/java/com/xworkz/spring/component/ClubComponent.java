package com.xworkz.spring.component;

public class ClubComponent {
	private String trustName;
	private int totalMembers;

	public ClubComponent(String trustName) {
		super();
		System.out.println("Invoked 1 Parameterized Constructor" + " arg" + trustName);
		this.trustName = trustName;
	}

	public ClubComponent(String trustName, int totalMembers) {
		super();
		System.out.println("Invoked 2 Parameterized Constructor" + " arg1" + trustName + " arg2" + totalMembers);
		this.trustName = trustName;
		this.totalMembers = totalMembers;
	}

	public String getTrustName() {
		return trustName;
	}
}
