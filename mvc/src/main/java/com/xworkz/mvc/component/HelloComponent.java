package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;

@Component
public class HelloComponent {
	public HelloComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
