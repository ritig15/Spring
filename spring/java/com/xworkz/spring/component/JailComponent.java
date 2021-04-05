package com.xworkz.spring.component;

public class JailComponent {
	public JailComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	public void punishment() {
		System.out.println("Invoked punishment");
	}
}
