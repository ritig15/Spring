package com.xworkz.spring.component;

public class CameraComponent {
	public CameraComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	public void capture(String whatToCapture) {
		System.out.println("Invoked capture method");
		System.out.println("Captured: "+whatToCapture);
	}
}
