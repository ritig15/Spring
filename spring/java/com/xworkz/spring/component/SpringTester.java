package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		String xmlFileName="start-spring.xml";
		String xmlFileName2="second.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName,xmlFileName2);
		
		int no= spring.getBeanDefinitionCount();
		
		System.out.println("No of beans: "+no);
	}

}
