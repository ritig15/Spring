package com.xworkz.itcproduct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ITCTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-itc.xml");
		ITCProduct refOfItcProduct = context.getBean(ITCProduct.class);
		refOfItcProduct.displayDetails();

	}

}
