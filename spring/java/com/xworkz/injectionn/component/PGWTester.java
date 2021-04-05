package com.xworkz.injectionn.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PGWTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("injex.xml");
		PGComponent pgComponent=container.getBean(PGComponent.class);
		pgComponent.getOwnerName();

	}

}
