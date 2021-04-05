package com.xworkz.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("injection.xml");
		Browser refOfBrowser = container.getBean(Browser.class);
		refOfBrowser.surfing();

	}

}
