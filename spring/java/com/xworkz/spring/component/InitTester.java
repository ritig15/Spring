package com.xworkz.spring.component;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitTester {

	public static void main(String[] args) {
		String xmlFileName = "spring-init.xml";

		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFileName);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		String refOfString = container.getBean(String.class);
		System.out.println(refOfString);

	}
}