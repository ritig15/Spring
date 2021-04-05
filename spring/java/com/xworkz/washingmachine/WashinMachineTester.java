package com.xworkz.washingmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WashinMachineTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("washingmachine.xml");
		WashingMachine refOfWashingMachine = container.getBean(WashingMachine.class);
		refOfWashingMachine.wash();
		refOfWashingMachine.displayMachineDetails();

	}

}
