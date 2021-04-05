package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester2 {

	public static void main(String[] args) {
		String xmlFile = "second.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFile);

		InsuranceComponent refOfInsuranceComponent = container.getBean(InsuranceComponent.class);
		refOfInsuranceComponent.policyName();
	}

}
